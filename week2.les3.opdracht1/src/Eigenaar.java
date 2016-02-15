/**
 * Created by lucas on 8-2-2016.
 */
public class Eigenaar {

    String naam;
    int giroNr;


    public Eigenaar (String nm) {
        naam = nm;
    }

    public void setGiroNr (int nr) {
        giroNr = nr;
    }

    public int getGiroNr () {
        return giroNr;
    }
    public String getNaam () {
        return naam;
    }


}
