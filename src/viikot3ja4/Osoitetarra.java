
/*
Tehtävänanto:
Tee ohjelma Osoitetarra, joka kysyy käyttäjältä etu- ja sukunimen, katuosoitteen, postinumeron ja postitoimipaikka.
Ohjelma näyttää kyseiset tiedot kolmelle riville samaan tapaan kuin osoitetarroissa. Näytä käyttäjän antamat tiedot siten,
ettei tekstien alussa ja lopussa ole turhia välilyöntejä. Etu- ja sukunimi sekä katuosoite alkavat suurella kirjaimella,
muut merkit ovat pieniä. Postitoimipaikka näytetään suurilla kirjaimilla.
*/

package viikot3ja4;

import java.util.Scanner;

public class Osoitetarra {
    public static void main(String[] args) {

        String [] answers = new String[5];
        String [] questions = {"Anna etunimi: ", "Anna sukunimi: ", "Anna katuosoite: ", "Anna postinumero ja postitoimipaikka: "};
        String temp;

        Scanner input = new Scanner(System.in);

        // Asking the questions
        for (int i = 0; i < questions.length; i++) {
            if (!questions[i].equals("Anna postinumero ja postitoimipaikka: ")) {
                System.out.print(questions[i]);
                temp = input.nextLine();
                answers[i] = temp;
            } else {
                System.out.print(questions[i]);
                temp = input.next();
                answers[i] = temp;
                temp = input.next();
                answers[++i] = temp;
            }
        }

        // Formatting the answers
        String firstName = answers[0];
        String firstChar = firstName.substring(0,1).toUpperCase();
        String otherChar = firstName.substring(1).toLowerCase();
        firstName = firstChar + otherChar;

        String lastName = answers[1];
        String firstChar0 = lastName.substring(0,1).toUpperCase();
        String otherChar0 = lastName.substring(1).toLowerCase();
        lastName = firstChar0 + otherChar0;

        String address = answers[2];
        String firstChar1 = address.substring(0,1).toUpperCase();
        String otherChar1 = address.substring(1).toLowerCase();
        address = firstChar1 + otherChar1;

        String zipCode = answers[3];
        String city = answers[4].toUpperCase();

        // Printing formatted answers
        System.out.println(firstName + " " + lastName);
        System.out.println(address);
        System.out.println(zipCode + " " + city);
    }
}
