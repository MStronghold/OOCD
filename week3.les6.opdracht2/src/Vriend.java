/**
 * Created by lucas on 30-3-2016.
 */
public class Vriend {
    String voornaam;
    String achternaam;
    String email;

    public Vriend(String vnm, String anm, String em,){
        voornaam = vnm;
        achternaam = anm;
        email = em;

    }

    public boolean equals(Object andereObject){
        return true;
    }


    public String toString(){

        return voornaam + achternaam + email;
    }
}
