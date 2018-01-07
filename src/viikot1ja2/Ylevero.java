
/*
Tehtävänanto:
Tee ohjelma Ylevero, joka kysyy käyttäjän vuositulot sekä iän ja laskee yleveron.
Ylevero on 0,68 % vuosituloista kuitenkin maksimissaan 140 euroa. Yleveroa ei mene,
jos vuositulot jäävät alle 7353 euron. Alle 18-vuotias ei maksa yleveroa.
Muotoile vastaus kahdella desimaalilla.
*/

package viikot1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {

    public static void main(String[] args) {

        double totalIncome;
        int age;
        double yleTax;

        Scanner input = new Scanner(System.in);
        DecimalFormat des = new DecimalFormat("0.00");

        System.out.print("Anna vuositulosi ja ikäsi: ");
        totalIncome = input.nextDouble();
        age = input.nextInt();

        if (age < 18 || totalIncome < 7353) {
            System.out.println("Ylevero on 0,00");
        } else {
            yleTax = (totalIncome / 100) * 0.68 ;
            if (yleTax >= 140) {
                System.out.println("Ylevero on 140");
            } else {
                System.out.println("Ylevero on " + des.format(yleTax));
            }
        }
    }
}
