/**
 * Created by lucas on 30-3-2016.
 */
public class Vriend {
    private String voornaam, achternaam, email;

    public Vriend(String vnm, String anm, String em) {
        voornaam = vnm;
        achternaam = anm;
        email = em;
    }

    public boolean equals(Object andereObject) {
        if(andereObject instanceof Vriend) {
            Vriend andereVriend = (Vriend) andereObject;
            return this.voornaam.equals(andereVriend.voornaam) &&
                    this.achternaam.equals(andereVriend.achternaam) &&
                    this.email.equals(andereVriend.email);
        }
        return false;
    }

    public String toString() { return voornaam + " " + achternaam + ", email: " + email + "\n"; }}