
/*
Tehtävänanto:
Tee ohjelma Lampotilat, joka kysyy käyttäjältä lämpötiloja maksimissaan 100 kappaletta.
Käyttäjä lopettaa lämpötilojen syöttämisen luvulla -999.
Tämän jälkeen ohjelma näyttää annetut lämpötilat pienimmästä suurimpaan.
*/

package viikot3ja4;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {
    public static void main(String[] args) {

        int temperatures[] = new int[100];

        Scanner input = new Scanner(System.in);

        // Asking for user input
        for (int i = 0; i < 99; i++) {
            int temp; // Temporary number for checking if user input matches -999
            System.out.print("Anna lämpötila: ");
            temp = input.nextInt();
            if (temp == -999) {
                break;
            } else {
                temperatures[i] = temp;
            }
        }

        Arrays.sort(temperatures);

        // Printing out given answers sorted and formatted
        System.out.print("Annoit lämpötilat: ");
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] != 0) {
                System.out.print(temperatures[i] + " ");
            }
        }
    }
}
