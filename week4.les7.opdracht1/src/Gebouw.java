public class Gebouw {
    private int lengte, breedte, aantalVerdiepingen;
    public int laatsteRenovatie;

    public Gebouw() {}

    public Gebouw(int l, int b, int aV) {
        lengte =             l;
        breedte =            b;
        aantalVerdiepingen = aV;
    }

    public int oppervlakte() {
        return lengte*breedte;
    }

    public void renoveer(int jaarBuiten) {
        laatsteRenovatie = jaarBuiten;
    }

    public int berekenHuur() {
        return oppervlakte()*75;
    }

    public String toString() {
        return "Dit " + (this instanceof Huis ? "huis" : "gebouw") + " heeft " + aantalVerdiepingen
                + (aantalVerdiepingen > 1 ? " verdiepingen" : " verdieping") + ", is "
                + breedte + " meter breedt, " + lengte + " meter lang en heeft een oppervlakte van " + oppervlakte()
                + " m2." + (!(this instanceof Huis) ? "\nDit gebouw is voor het laatst in het jaar "
                + laatsteRenovatie + " buiten gerenoveerd.\nDe huurprijs van dit gebouw is €" + berekenHuur() + "\n" : "");
    }
}
