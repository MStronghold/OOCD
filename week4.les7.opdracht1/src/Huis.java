
public class Huis extends Gebouw{
    private boolean isGeisoleerd;
    public int laatsteRenovatie;

    public Huis() {}

    public Huis(int l, int b, int aV) {
        super(l, b, aV);
    }

    public Huis(int l, int b, int aV, boolean isG) {
        super(l, b, aV);
        isGeisoleerd = isG;
    }

    public void isoleer() {
        isGeisoleerd = true;
    }

    public void renoveer(int binnen) {
        this.laatsteRenovatie = binnen;
    }

    public void renoveer(int binnen, int buiten) {
        this.laatsteRenovatie = binnen;
        super.renoveer(buiten);
    }

    public int berekenHuur() {
        return super.oppervlakte()*100;
    }

    public String toString() {
        return super.toString()
                + "\nDit huis is " + (isGeisoleerd ? "wel" : "niet")
                + " geïsoleerd en er is voor het laatst in het jaar " + laatsteRenovatie
                + " binnen gerenoveerd en buiten in het jaar " + super.laatsteRenovatie
                + ".\nDe huurprijs van dit huis is €" + berekenHuur() + "\n";
    }
}
