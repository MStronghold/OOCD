import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList<Vriend> mijnVrienden;

    public FacebookAccount(String nm) {
        naam = nm;
        mijnVrienden = new ArrayList<>();
    }

    public String getNaam() { return naam; }

    public void voegVriendToe(Vriend nwV) {
        if(!isVriendMet(nwV))
            mijnVrienden.add(nwV);
    }

    public boolean verwijderVriend(Vriend exV) {
        boolean isVriend = isVriendMet(exV);
        if(isVriend)
            mijnVrienden.remove(exV);
        return isVriend;
    }

    public boolean isVriendMet(Vriend v) {
        for(Vriend vriend : mijnVrienden)
            if(v.equals(vriend))
                return true;
        return false;
    }

    public int aantalVrienden() { return mijnVrienden.size(); }

    public String toString() {
        String s = getNaam() + " heeft " + aantalVrienden() + " vrienden:\n";
        for(Vriend vriend : mijnVrienden)
            s = s.concat(vriend.toString());
        return s;
    }
}