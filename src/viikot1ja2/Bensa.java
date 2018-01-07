
/*
Tehtävänanto:
Tee ohjelma Bensa, joka laskee, paljonko maksaa kilometrin ajaminen.
Käyttäjältä pyydetään tankattu määrä litroina (double), ajetut kilometrit (int)
sekä bensan litrahinta (double). Ohjelma laskee ja näyttää kilometrihinnan.
Muotoile vastaus kahdella desimaalilla.
*/

package viikot1ja2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Bensa {

    public static void main(String[] args) {

        // === Variables === //
        double gas;
        int kilometer;
        double gasPrice;
        double pricePerKilometer;

        Scanner input = new Scanner(System.in);
        DecimalFormat des = new DecimalFormat("0.00");

        System.out.print("Anna tankattu määrä: ");
        gas = input.nextDouble();
        System.out.print("Anna ajetut kilometrit: : ");
        kilometer = input.nextInt();
        System.out.print("Anna litrahinta: ");
        gasPrice = input.nextDouble();
        pricePerKilometer = ((gas/kilometer) * gasPrice);
        System.out.println("Ajo per kilometri maksaa " + des.format(pricePerKilometer));
    }
}
