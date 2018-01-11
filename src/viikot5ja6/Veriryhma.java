
/*
Tehtävänanto:
Tee ohjelma Veriryhma, joka kysyy luovuttajien veriryhmiä ja kertoo kaikkien luovutusten määrän
sekä tietyn verityhmän luovutusten määrän. Veriryhmiä kysytään, kunnes veriryhmäksi annetaan – tai
maksimissaan 1000 kappaletta. Tämän jälkeen ohjelma kysyy, minkä veriryhmän luovutusten määrä lasketaan.
Lopuksi ohjelma kertoo kaikkien luovutusten määrän sekä pyydetyn veriryhmän luovutusten määrän.
*/

package viikot5ja6;

import java.util.Scanner;

public class Veriryhma {

    Scanner input = new Scanner(System.in);

    public String askBloodType() {
        String temp;
        System.out.print("Anna veriryhmä (- lopettaa): ");
        temp = input.next();
        return temp;
    }

    public void displayAnswerCount(int answerCount) {
        System.out.print("Luovutuksia oli yhteensä " + answerCount);
    }

    public void displayShortedBloodTypeCount(String bloodType, String answers []) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (bloodType.equals(answers[i])) {
                count ++;
            }
        }
        System.out.println("Veriryhmän " + bloodType + " luovutuksia oli " + count);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Veriryhma veriryhma = new Veriryhma();
        String answers [] = new String [1000];
        String bloodType;
        int answerCount = 0;

        for (int i = 0; i < 1000; i++) {
            answers[i] = veriryhma.askBloodType();
            answerCount++;
            if (answers[i].equals("-")) {
                --answerCount;
                break;
            }
        }

        veriryhma.displayAnswerCount(answerCount);
        System.out.print('\n' + "Minkä veriryhmän luovutusten määrän haluat tietää: ");
        bloodType = input.next();
        veriryhma.displayShortedBloodTypeCount(bloodType, answers);
    }

}
