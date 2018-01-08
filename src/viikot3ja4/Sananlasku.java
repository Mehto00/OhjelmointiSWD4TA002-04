
/*
Tehtävänanto:
Tee ohjelma Sananlasku, joka kysyy käyttäjältä sananlaskuja.
Sananlaskujen pyytämistä jatketaan, kunnes käyttäjä antaa sananlaskuksi LOPPU.
Lopuksi ohjelma kertoo, montako sananlaskua annettiin ja montako merkkiä niissä yhteensä oli.
*/

package viikot3ja4;

import java.util.Scanner;

public class Sananlasku {
    public static void main(String[] args) {

        String proverb;
        int proverbCount = 0;
        int totalChars = 0;

        Scanner input = new Scanner(System.in);

        // Asking for user input
        do {
            System.out.print("Anna sananlasku: ");
            proverb = input.nextLine();
            proverbCount++;
            int temp = proverb.length();
            totalChars = totalChars + temp;
        } while (!proverb.equals("LOPPU"));

        // Printing out given answers sorted and formatted
        System.out.println("Sananlaskuja oli " + (proverbCount-1) + " kappaletta.");
        System.out.println("Sananlaskuissa oli merkkejä yhteensä  " + (totalChars-5));
    }
}
