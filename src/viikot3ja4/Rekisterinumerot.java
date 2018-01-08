
/*
Tehtävänanto:
Tee ohjelma Rekisterinumerot, joka kysyy rekisterinumeroita maksimissaan 10 kappaletta
tai kunnes rekisterinumeroksi annetaan –. Jos taulukko täyttyy, ohjelma kertoo ”Ei enää rekisterinumeroita”.
Kukin rekisterinumero laitetaan taulukkoon siten, että rekisterinumeron kirjaimet on muunnettu suurella kirjoitetuiksi.
Lopuksi ohjelma näyttää annetut rekisterinumerot.
*/

package viikot3ja4;

import java.util.Scanner;

public class Rekisterinumerot {
    public static void main(String[] args) {

        String licenseNumber;
        String [] licenseNumberArray = new String[10];

        Scanner input = new Scanner(System.in);

        // Asking for user input
        for (int i = 0; i <licenseNumberArray.length ; i++) {
            String temp; // Temporary string for checking if user input matches -
            System.out.println("Anna rekisterinumero (-lopettaa): ");
            temp = input.next();
            if (!temp.equals("-")) {
                licenseNumberArray[i] = temp.toUpperCase();
            } else {
                break;
            }
        }

        // Printing out given answers sorted and formatted
        for (int i = 0; i < licenseNumberArray.length; i++) {
            if (licenseNumberArray[i] != null) {
                System.out.println(licenseNumberArray[i]);
            }
        }

    }
}
