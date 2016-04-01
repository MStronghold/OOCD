import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsNaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsNaam = nm;
        budget = bud;
        alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g) {
        if(!alleGoederen.contains(g))
            alleGoederen.add(g);
    }

    public String toString() {
        String s = bedrijfsNaam + " met inventaris:\n";
        for(Object o : alleGoederen)
            s = s.concat(o.toString() + "\n");
        return s;
    }
}
