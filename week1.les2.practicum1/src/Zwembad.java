/**
 * Created by lucas on 4-2-2016.
 */
public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad (double br, double le, double di) {
        breedte = br;
        lengte = le;
        diepte = di;
    }

    public Zwembad() {

    }

    public void setBreedte(double br) {breedte = br;}
    public void setLengte(double le) {lengte = le;}
    public void setDiepte(double di) {diepte = di;}

    public double getBreedte(){return breedte;}
    public double getLengte(){return lengte;}
    public double getDiepte(){return diepte;}

    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public String toString() {
        return "Dit zwembad is " + breedte + ", " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}

