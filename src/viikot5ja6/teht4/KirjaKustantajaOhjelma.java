
/*
Tehtävänanto:
a) Tee luokka Kirja, jolla on attribuutit nimi (String), isbn (String) ja hinta (double).
Tee luokkaan parametriton ja parametrillinen konstruktori, set- ja get-metodit ja toString-metodi.

b) Tee luokka Kustantaja, jolla on attribuutit nimi (String), osoite (String) ja puhelin (String).
Tee luokkaan parametriton ja parametrillinen konstruktori, set- ja get-metodit ja toString-metodi.

c) Lisää Kirja-luokkaan attribuutti kustantaja. Kirja-luokan kustantaja-attribuutti kertoo kirjan
yhteyssuhteen Kustantaja-luokkaan. Lisää Kirja-luokkaan yhteyssuhdetta varten tarvittava koodi/metodit
(konstruktorit, set-, get- ja toString-metodit).

Tee Kirja-luokalle pääohjelma KirjaKustantajaOhjelma, jolla luodaan Kustantaja-luokan olio ja Kirja-luokan oliot
parametrillisilla konstruktoreilla. Näytä tiedot Kirja-luokan get-metodeilla.
*/

package viikot5ja6.teht4;

import java.util.Scanner;

public class KirjaKustantajaOhjelma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputLine = new Scanner(System.in);

        Kirja kirja = new Kirja();
        Kustantaja kustantaja = new Kustantaja();

        System.out.print("Kirjan nimi: ");
        kirja.setBookName(inputLine.nextLine().trim());
        System.out.print("Kirjan isbn: ");
        kirja.setIsbn(input.next());
        System.out.print("Kirjan hinta: ");
        kirja.setPrice(input.nextDouble());

        kirja.setKustantaja(kustantaja);
        System.out.print("Kustantajan nimi: ");
        kustantaja.setPublisherName(inputLine.nextLine());
        System.out.print("Kustantajan osoite: ");
        kustantaja.setAddress(inputLine.nextLine());
        System.out.print("Kustantajan puhelin: ");
        kustantaja.setPhoneNumber(input.next());
        System.out.println("Kirjan " + kirja.getBookName() + " kustantaja on " + kirja.getKustantaja().getPublisherName());
    }



}
