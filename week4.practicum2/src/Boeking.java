import java.time.LocalDate;

public class Boeking {
    private LocalDate boekDatum, aankomstDatum, vertrekDatum;
    private Klant deBoeker;
    private Kamer geboekteKamer;

    public Boeking(LocalDate aankomst, LocalDate vertrek) {
        boekDatum = LocalDate.now();
        aankomstDatum = aankomst;
        vertrekDatum = vertrek;
    }

    public void setDeBoeker(Klant k) {
        deBoeker = k;
    }

    public void wijsKamerToe(Kamer k) {
        geboekteKamer = k;
    }

    public LocalDate getAankomstDatum() {
        return aankomstDatum;
    }

    public LocalDate getVertrekDatum() {
        return vertrekDatum;
    }

    public Kamer getKamer() {
        return geboekteKamer;
    }

    public String toString() {
        String s = "Boekingsdatum: " + boekDatum.toString() + "; ";
        s += "klant: " + deBoeker + "; ";
        s += "aankomst: " + aankomstDatum.toString() + ", vertrek: " + vertrekDatum.toString() + "; ";
        return s + geboekteKamer.toString();
    }
}

