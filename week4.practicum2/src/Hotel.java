import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String naam;
    private List<Boeking> alleBoekingen = new ArrayList<Boeking>();
    private List<KamerType> alleKamerTypen = new ArrayList<KamerType>();
    private List<Kamer> alleKamers = new ArrayList<Kamer>();

    public Hotel(String nm) {
        naam = nm;

        KamerType kt1 = new KamerType("Standaard", 2, 60.00);
        KamerType kt2 = new KamerType("DeLuxe", 2, 85.00);

        alleKamerTypen.add(kt1);
        alleKamerTypen.add(kt2);

        alleKamers.add(new Kamer(3, kt1));
        alleKamers.add(new Kamer(1, kt2));
        alleKamers.add(new Kamer(4, kt2));
    }

    @SuppressWarnings("Duplicates")
    public int voegBoekingToe(LocalDate van, LocalDate tot, String nm, String adr, KamerType kt) {
        Boeking b = new Boeking(van, tot);
        b.setDeBoeker(new Klant(nm, adr));

        Kamer beschikbareKamer = zoekBeschikbareKamer(kt, b.getAankomstDatum(), b.getVertrekDatum());
        if (beschikbareKamer != null) {
            b.wijsKamerToe(beschikbareKamer);
            if (alleBoekingen.add(b)) {
                return beschikbareKamer.getKamerNummer();
            }
        }

        return -1;
    }

    private Kamer zoekBeschikbareKamer(KamerType gezochteType, LocalDate aankomst, LocalDate vertrek) {
        Kamer beschikbareKamer = null;

        for (Kamer kamer : alleKamers) {
            if (kamer.getHetType().equals(gezochteType)) {
                if (isBeschikbaar(kamer, aankomst, vertrek)) {
                    beschikbareKamer = kamer;
                    break;
                }
            }
        }

        return beschikbareKamer;
    }

    private boolean isBeschikbaar(Kamer kamer, LocalDate aankomst, LocalDate vertrek) {
        boolean isBeschikbaar = true;

        for (Boeking b : alleBoekingen) {
            if (b.getKamer().equals(kamer)) {

                //bool overlap = a.start < b.end && b.start < a.end;
                if (aankomst.isBefore(b.getVertrekDatum()) && b.getAankomstDatum().isBefore(vertrek)) {
                    isBeschikbaar = false;
                    break;
                }
            }
        }

        return isBeschikbaar;
    }

    public List<KamerType> getKamerTypen() {
        return alleKamerTypen;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Boekingen van hotel " + naam + ":");
        alleBoekingen.forEach(boeking -> result.append("\n\t" + boeking.toString()));
        return result.toString();
    }
}
