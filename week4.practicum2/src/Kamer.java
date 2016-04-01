public class Kamer {
    private int kamerNummer;
    private boolean extraBed = false;
    private KamerType hetType;

    public Kamer(int kN, KamerType tp) {
        kamerNummer = kN;
        hetType = tp;
    }

    public int getKamerNummer() {
        return kamerNummer;
    }
    public void setHetType(KamerType hT) {
        hetType = hT;
    }

    public KamerType getHetType() {
        return hetType;
    }

    public String toString() {
        String s = "kamer: " + kamerNummer + " van type: " + hetType;
        return s + " extra bed mogelijk: " + (extraBed ? "nee" : "ja");
    }
}

