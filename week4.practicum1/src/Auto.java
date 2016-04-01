import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    @Override
    public double huidigeWaarde() {
        return (super.nieuwPrijs * Math.pow(0.7, LocalDate.now().getYear() - super.bouwjaar));
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if(obj instanceof Auto) {
            Auto a = (Auto) obj;
            if (this.kenteken.equals(a.kenteken))
                equals = true;

        }
        return equals;
    }
}
