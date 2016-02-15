/**
 * Created by lucas on 4-2-2016.
 */
public class Student {
    private String naam;
    private int studentNummer;

    public Student(String nm) {
        naam = nm;

    }
    public Student(String nm, int stNr){
        naam = nm;
        studentNummer = stNr;
    }

    public String getNaam() {
        return naam;
    }

    public void setStudentNummer(int stNr) {
        studentNummer = stNr;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public String toString() {
        return "Deze student heet " + naam + " en heeft nummer: " + studentNummer;
    }
}
