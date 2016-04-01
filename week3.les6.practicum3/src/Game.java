import java.time.LocalDate;


public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam() { return naam; }

    public double huidigeWaarde() {
        return nieuwprijs*Math.pow(0.7, LocalDate.now().getYear()-releaseJaar);
    }

    public boolean equals(Object andereObject) {
        return (andereObject instanceof Game && this.getNaam().equals(((Game) andereObject).getNaam()));
    }

    public String toString() {
        return "\t\t" + naam + ", uitgegeven in " +
                releaseJaar + "; nieuwprijs: €" +
                nieuwprijs + " nu voor: €" +
                String.format("%.2f", huidigeWaarde()) + "\n";
    }
}
