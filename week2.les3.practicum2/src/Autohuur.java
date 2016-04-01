public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){}

    public void setAantalDagen(int aD){
        aantalDagen = aD;
    }

    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k){
        huurder = k;
    }

    public Klant getHuurder(){
        return huurder;
    }

    public double totaalPrijs(){
        if(huurder != null && gehuurdeAuto != null) {
            return (gehuurdeAuto.getPrijsPerDag() * aantalDagen) * ((100 - huurder.getKorting()) / 100);
        }
        else return 0.0;
    }

    public String toString(){
        String s;
        if(gehuurdeAuto == null){
            s = " er is geen auto bekend";
        }
        else {s = " " + getGehuurdeAuto().toString();}
        String s1;
        if(huurder == null){
            s1 = " er is geen huurder bekend";
        }
        else {s1 = getHuurder().toString();}


        return s + "\n" + s1 + "\n aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();

    }
}
