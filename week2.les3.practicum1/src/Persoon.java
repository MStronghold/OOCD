/**
 * Created by lucas on 15-2-2016.
 */
public class Persoon {
    private String naam;
    private int leeftijd;


    public Persoon(String nm, int lft){
        naam = nm;
        leeftijd = lft;

    }

    public String toString(){
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
