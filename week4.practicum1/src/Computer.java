import java.time.LocalDate;


public class Computer implements Goed {
    private String type, macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String ma, double ap, int jr) {
        type = tp;
        macAdres = ma;
        aanschafPrijs = ap;
        productieJaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        return (aanschafPrijs * Math.pow(0.6, LocalDate.now().getYear() - productieJaar));
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if(obj instanceof Computer) {
            Computer c = (Computer) obj;
            if (this.type.equals(c.type) &&
                    this.macAdres.equals(c.macAdres) &&
                    this.aanschafPrijs == c.aanschafPrijs &&
                    this.productieJaar == c.productieJaar)
                equals = true;

        }
        return equals;
    }

    public String toString() {
        return "Computer: " + type + " heeft een waarde van €" + String.format("%.2f", huidigeWaarde());
    }
}
