public class Autohuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public Autohuur(){}

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
}
