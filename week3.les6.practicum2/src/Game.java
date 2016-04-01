import java.time.LocalDate;

/**
 * Created by jmeulenbeld on 09/02/16.
 */
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
        if(andereObject instanceof Game) {
            Game game = (Game) andereObject;
            return this.getNaam().equals(game.getNaam());
        }
        return false;
    }

    public String toString() {
        return "\t\t" + naam + ", uitgegeven in " +
                releaseJaar + "; nieuwprijs: " +
                nieuwprijs + " nu voor: €" +
                String.format("%.2f", huidigeWaarde()) + "\n";
    }
}