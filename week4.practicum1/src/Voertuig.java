
public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwPrijs;
    protected int bouwjaar;

    public Voertuig(String tp, double nP, int jr){
        type = tp;
        nieuwPrijs = nP;
        bouwjaar = jr;
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if(obj instanceof Voertuig) {
            Voertuig v = (Voertuig) obj;
            if (this.type.equals(v.type) &&
                    this.nieuwPrijs == v.nieuwPrijs &&
                    this.bouwjaar == v.bouwjaar)
                equals = true;

        }
        return equals;
    }

    public String toString() {
        return "Voertuig: " + type + "met bouwjaar " + bouwjaar + " heeft een waarde van: €"
                + String.format("%.2f", this.huidigeWaarde());
    }
}
