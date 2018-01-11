
/*
Tehtävänanto:
Tee ohjelma Kulutus, jolla voidaan laskea bensan kulutus sadalla kilometrillä.
Ohjelma kysyy ajetut kilometrit ja kuluneen polttoaineen määrän.
*/


package viikot5ja6;

import java.util.Scanner;

public class Kulutus {

    Scanner input = new Scanner(System.in);

    public int kysyKilometrit() {
        System.out.print("Anna ajetut kilometrit: ");
        int km = input.nextInt();
        return km;
    }

    public int kysyLitrat() {
        System.out.print("Anna kulunut polttoainemäärä: ");
        int litrat = input.nextInt();
        return litrat;
    }

    public double laskeKulutus(int km, int litrat){
        double kulutus = ((double) litrat/km) * 100;
        return kulutus;
    }

    public void naytaKulutus(double kulutus) {
        System.out.println("Kulutus/100km on " + kulutus + " litraa");
    }

    public static void main(String[] args) {
        Kulutus kulutus = new Kulutus();

        int km = kulutus.kysyKilometrit();
        int litrat = kulutus.kysyLitrat();
        double mKulutus = kulutus.laskeKulutus(km, litrat);
        kulutus.naytaKulutus(mKulutus);
    }
}
