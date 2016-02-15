
public class Piloot {
    private String naam;
    private double salaris;
    private int Vlieguren;

    public Piloot(String nm) {
        naam = nm;

    }

    public void setSalaris(double sa) {
        salaris = sa;
    }

    public double getSalaris() {
        return salaris;
    }

    public int getVlieguren() {
        return Vlieguren;

    }

    public void verhoogVliegurenMet(int vu) {
        Vlieguren = vu;
    }

    public String toString() {
        return naam + " heeft " + Vlieguren + " vlieguren gemaakt en verdient " + salaris;

    }
}
