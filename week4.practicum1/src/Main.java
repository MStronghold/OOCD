import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris inventaris = new BedrijfsInventaris("HU", 2000000);
        int ditJaar = LocalDate.now().getYear();
        int vorigJaar = LocalDate.now().getYear()-1;
        Computer c1 = new Computer("EliteBook 850","00:0C:6E:D2:11:E6", 1311.30, vorigJaar);
        Computer c2 = new Computer("EliteBook 850", "00:0C:6E:D2:11:E6", 1311.30, vorigJaar);
        Computer c3 = new Computer("EliteBook 840", "00:0C:6E:00:D2:A6", 1499.29, vorigJaar);
        Auto a1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, vorigJaar, "4-ZTV-94");
        Auto a2 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, vorigJaar, "4-ZTV-94");
        Auto a3 = new Auto("Fiat 500L L 0.9 TwinAir Turbo", 29995.00, vorigJaar, "7-ZNH-92");
        Fiets f1 = new Fiets("Giant Prime E+1", 1849.00, ditJaar, 1693897);
        Fiets f2 = new Fiets("Giant Prime E+1", 1849.00, ditJaar, 1693897);
        Fiets f3 = new Fiets("Gazelle Orange C8 Hybrid", 2039.00, ditJaar, 7983961);
        inventaris.schafAan(c1); inventaris.schafAan(c2); inventaris.schafAan(c3);
        inventaris.schafAan(a1); inventaris.schafAan(a2); inventaris.schafAan(a3);
        inventaris.schafAan(f1); inventaris.schafAan(f2); inventaris.schafAan(f3);
        System.out.println(inventaris);
    }
}