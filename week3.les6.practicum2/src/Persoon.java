import java.util.ArrayList;


public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
        mijnGames = new ArrayList<>();
    }

    public boolean koop(Game g) {
        if(!mijnGames.contains(g) && g.huidigeWaarde() <= budget) {
            mijnGames.add(g);
            budget -= g.huidigeWaarde();
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon p) {
        if(mijnGames.contains(g) && p.koop(g)) {
            budget += g.huidigeWaarde();
            mijnGames.remove(g);
            return true;
        }
        return false;
    }

    public String toString() {
        String s = naam + " heeft een budget van €" +
                String.format("%.2f", budget) +
                " en bezit de volgende games:\n";
        for(Game game : mijnGames)
            s = s.concat(game.toString());
        return s;
    }
}