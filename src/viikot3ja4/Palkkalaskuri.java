
/*
Tehtävänanto:
Tee ohjelma Palkkalaskuri, jolla käyttäjä voi laskea annetun ajan bruttopalkan.
Ohjelma kysyy tuntipalkan ja kuinka monen päivän tunnit käyttäjä antaa.
Ohjelma kysyy tuntimäärän kunakin päivänä.
Lopuksi ohjelma tulostaa yhteistuntimäärän, bruttopalkan ja annetut tunnit.
*/

package viikot3ja4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Palkkalaskuri {
    public static void main(String[] args) {

        double wagePerHour;
        int daysWorked;
        int totalHours = 0;
        double grossIncome;

        Scanner input = new Scanner(System.in);
        DecimalFormat des = new DecimalFormat("0.00");

        System.out.print("Anna tuntipalkkasi: ");
        wagePerHour = input.nextDouble();
        System.out.print("Monenko päivän tuntimäärät annat: ");
        daysWorked = input.nextInt();

        int [] huorsGiven = new int[daysWorked];

        for (int i = 0; i < daysWorked; i++) {
            System.out.print("Anna tuntien määrä päivässä: ");
            huorsGiven[i] = input.nextInt();
            totalHours = totalHours + huorsGiven[i];
        }

        grossIncome = totalHours * wagePerHour;

        // Printing out given answers sorted and formatted
        System.out.println("Tunteja yhteensä: " + totalHours);
        System.out.println("Bruttopalkkasi: " + des.format(grossIncome));
        System.out.print("Annoit tunnit: " );
        for (int i = 0; i < huorsGiven.length; i++) {
            if (huorsGiven[i] != 0) {
                System.out.print(huorsGiven[i] + " ");
            }
        }
    }
}
