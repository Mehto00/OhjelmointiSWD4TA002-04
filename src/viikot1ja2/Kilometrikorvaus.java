
/*
Tehtävänanto:
Tee ohjelma Kilometrikorvaus, joka laskee omalla autolla ajojen kilometrikorvaukset.
Ohjelma kysyy ajokilometrejä, kunnes käyttäjä antaa nollan. Tämän jälkeen ohjelma näyttää
ajetut kilometrit sekä ajoista maksettavan korvauksen. Korvaus on 0.43 euroa per kilometri.
*/

package viikot1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {

    public static void main(String[] args) {

        int kilometersDriven = 0;
        int givenValue;

        Scanner input = new Scanner(System.in);
        DecimalFormat des = new DecimalFormat("0.00");

        do {
            System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
            givenValue = input.nextInt();
            kilometersDriven = kilometersDriven + givenValue;
        }while (givenValue != 0);

        System.out.println("Yhteensä " + kilometersDriven + " kilo kilometriä");
        System.out.println("Korvaus on " + des.format(kilometersDriven * 0.43)+ " euroa");
    }
}
