import java.time.LocalDate;


public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double nP, int jr, int fnr) {
        super(tp, nP, jr);
        framenummer = fnr;
    }

    @Override
    public double huidigeWaarde() {
        return (super.nieuwPrijs * Math.pow(0.9, LocalDate.now().getYear() - super.bouwjaar));
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if(obj instanceof Fiets) {
            Fiets f = (Fiets) obj;
            if (this.framenummer == f.framenummer)
                equals = true;

        }
        return equals;
    }
}
