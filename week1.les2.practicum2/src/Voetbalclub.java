/**
 * Created by lucas on 4-2-2016.
 */
public class Voetbalclub {
    String naam;
    int aantalGewonnen;
    int aantalGelijk;
    int aantalVerloren;

    public Voetbalclub(String nm) {
        naam = nm;

    }


    public void verwerkResultaat(char ch) {
        if (ch == 'w') aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g') aantalGelijk = aantalGelijk + 1;
        if (ch == 'v') aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalVerloren + aantalGelijk;
    }

    public int aantalPunten() {
        return (aantalGewonnen*3) + aantalGelijk;
    }

    public String toString() {
        return naam + "\t" + aantalGespeeld()
                + "\t\t" + aantalGewonnen + "\t"
                + aantalGelijk + "\t"
                + aantalVerloren + "\t\t"
                + aantalPunten();
    }
}
