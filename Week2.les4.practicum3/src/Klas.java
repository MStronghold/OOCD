import java.util.ArrayList;


public class Klas {
    private ArrayList<Leerling> deLeerlingen = new ArrayList<>();
    private String klasCode;

    public Klas(String kC) {
        klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);

    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for (Leerling l : deLeerlingen) {
            if(l.getNaam().equals(nm)) {
                l.setCijfer(nweCijfer);
            }
        }

    }

    public ArrayList<Leerling> getLeerlingen(){
            return deLeerlingen;
        }


    public int aantalLeerlingen(){
        return deLeerlingen.size();

    }

    public String toString(){

        return "In klas " + klasCode + " zitten de volgende leerlingen:\n" + getLeerlingen() ;

    }

}
