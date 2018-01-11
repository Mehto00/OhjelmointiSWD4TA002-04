
/*
Tehtävänanto:
Tee luokka Auto ja sille pääohjelma AutoOhjelma.
Auto -luokalla on attribuutit malli, merkki, rekisterinumero ja vuosimalli. Tee luokkaan set-, get-
ja toString -metodit, parametriton konstruktori ja parametrillinen konstruktori. Tee luokkaan myös
getIka -metodi, mikä kertoo auton iän. Käytä metodin tekemiseen Date-luokkaa, vuosimalli-attribuuttia
sekä Integer.parseInt -metodia. Tee pääohjelmassa Auto-luokan olio parametrittomallakonstruktorilla.
Käytä pääohjelmassa set-metodeja tietojen muuttamiseen ja get-metodeja tietojen näyttämiseen.
*/

package viikot5ja6.teht3;

import java.util.Scanner;

public class AutoOhjelma {

    public static void main(String[] args) {

        Auto auto = new Auto();
        Scanner input = new Scanner(System.in);

        // Asking the information from user
        try {
            System.out.print("Anna merkki: ");
            auto.setBrand(auto.toTitleCase(input.next()));
            System.out.print("Anna malli: ");
            auto.setModel(auto.toTitleCase(input.next()));
            System.out.print("Anna rekisterinumero: ");
            auto.setLicenceNumber(input.next().toUpperCase());
            System.out.print("Anna vuosimalli: ");
            auto.setModelYear(input.nextInt());

            System.out.println("Autosi merkki ja malli ovat: " + auto.getBrand() + " " + auto.getModel());
            System.out.println("Autosi rekisterinumero on: " + auto.getLicenceNumber());
            System.out.println("Autosi ikä on: " + auto.getIka());
        } catch (Exception e) {
            System.out.println("Virhe syötettäessä arvoja (" + e + ")");
        }
    }
}
