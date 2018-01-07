
/*
Tehtävänanto:
Tee ohjelma RandomTest, joka heittää arpaa 10 000 kertaa ja kertoo kuinka monta kertaa tuli numero 6.
Jos satunnaislukugeneraattori toimii oikein, tulisi luvun 6 tulla noin 1667 kertaa (10 000/6).
Hyväksytään +/- 10 % heitto, eli tuloksen tulisi olla välillä 1500–1833 kertaa.
Ohjelma kertoo toimiiko satunnaislukugeneraattori +/- 10 % vaihteluvälillä oikein.
*/

package viikot1ja2;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        int total = 0;

        for (int i = 0; i < 10000; i++) {
            Random r = new Random();
            int noppa = r.nextInt(6) + 1;  //noppa saa arvon 1-6

            if (noppa == 6) {
                total++;
            }
        }

        System.out.println("Numero 6 tuli " + total + "kertaa.");

        if (total >= 1500 && total <=1833) {
            System.out.println("Satunnaislukugeneraattori toimii oletetusti.");
        } else {
            System.out.println("Satunnaislukugeneraattori ei toimi oletetusti.");
        }
    }
}
