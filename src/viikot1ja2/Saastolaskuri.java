
/*
Tehtävänanto:
Tee ohjelma Saastolaskuri, joka kysyy säästötavoitteen ja kuukausien lukumäärän.
Ohjelma tulostaa kunkin kuukauden säästömäärän ja kokonaissäästösumman
*/

package viikot1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Saastolaskuri {

    public static void main(String[] args) {

        double savingGoal;
        double numberOfMoths;
        double savingsPerMonth;
        double totalSaved = 0;
        int j = 0; // month index number

        Scanner input = new Scanner(System.in);
        DecimalFormat des = new DecimalFormat("0.00");

        System.out.print("Anna säästötavoite: ");
        savingGoal = input.nextDouble();
        System.out.print("Anna kuukausien lukumäärä: ");
        numberOfMoths = input.nextDouble();

        for (int i = 0; i < numberOfMoths; i++) {
            savingsPerMonth = savingGoal / numberOfMoths;
            totalSaved = totalSaved+savingsPerMonth;
            j = j+1;
            System.out.println(j + ". kuukausi " + des.format(savingsPerMonth) + " euroa, säästösumma " + des.format(totalSaved) + " euroa");
        }

    }
}
