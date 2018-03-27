
/*
Tehtävänanto:
Tee ohjelma HenkiloListaSovellus, jolla voidaan
lisätä ja käsitellä listalla olevia henkilöitä.
*/

package viikot7ja8;

import java.util.ArrayList;

public class HenkiloListaSovellus {
   private Lukija lukija = new Lukija();
   private ArrayList<Henkilo> henkilot = new ArrayList<>();

    public HenkiloListaSovellus(){
        showOptions();
    }

    private void showOptions() {

        int options = 0;

        do {
            System.out.println("1. Lisää henkilö");
            System.out.println("2. Näytä henkilön tiedot");
            System.out.println("3. Muuta henkilön nimi ja osoite");
            System.out.println("4. Muuta henkilön koko");
            System.out.println("5. Näytä kaikki henkilöt");
            System.out.println("0. Lopetus\n");

            options = lukija.lueKokonaisluku("Anna valintasi (0-5): ");

            switchBoard(options);

        } while (options !=0);
    }

    private void switchBoard(int options) {
        String userChose;
        switch (options) {
            case 1:  userChose = "1";
                lisaaHenkilo();
                break;
            case 2:  userChose = "2";
                naytaHenkilo();
                break;
            case 3:  userChose = "3";
                muutaHenkilonNimiJaOsoite();
                break;
            case 4:  userChose = "4";
                muutaHenkilonKoko();
                break;
            case 5:  userChose = "5";
                listaaHenkilot();
                break;
            case 6:  userChose = "0";
                System.out.println(userChose + ": Lopetit ohjelman");
                break;

            default: userChose = "Väärä syöte: annettu luku ei kelpaa";
                break;
        }
    }

    private void listaaHenkilot() {
        for (int i = 0; i < henkilot.size(); i++) {
            System.out.println("Nimi: " + henkilot.get(i).getNimi());
            System.out.println("Osoite: " + henkilot.get(i).getOsoite());
            System.out.println("Pituus: " + henkilot.get(i).getKoko().getPituus());
            System.out.println("Painoindeksi: " + henkilot.get(i).getKoko().getPainoindeksi() + "\n");
        }
    }

    private void muutaHenkilonKoko() {
        String nimi = lukija.lueTeksti("Anna kokoa muutettavan henkilön nimi: ");
        boolean nameFound = false;

        for (int i = 0; i < henkilot.size(); i++) {
            if (nimi.equals(henkilot.get(i).getNimi())) {
                nameFound = true;
                if (nameFound) {
                    Double newHeight = lukija.lueDesimaaliluku("Anna pituus: ");
                    henkilot.get(i).getKoko().setPituus(newHeight);
                    int newWeight = lukija.lueKokonaisluku("Anna paino: ");
                    henkilot.get(i).getKoko().setPaino(newWeight);
                    System.out.println("\n");
                } else if (!nameFound){
                    System.out.println("Henkilöä ei ole\n");
                }
            }
        }
    }

    private void muutaHenkilonNimiJaOsoite() {
        String nimi = lukija.lueTeksti("Anna perustietoja muutettavan henkilön nimi: ");
        boolean nameFound = false;

        for (int i = 0; i < henkilot.size(); i++) {
            if (nimi.equals(henkilot.get(i).getNimi())) {
                nameFound = true;
                if (nameFound) {
                    String newName = lukija.lueTeksti("Anna nimi: ");
                    henkilot.get(i).setNimi(newName);
                    String newAddress = lukija.lueTeksti("Anna osoite: ");
                    henkilot.get(i).setOsoite(newAddress);
                    System.out.println("\n");
                } else if (!nameFound){
                    System.out.println("Henkilöä ei ole\n");
                }
            }
        }
    }

    private void naytaHenkilo() {
        String nimi = lukija.lueTeksti("Anna näytettävän henkilön nimi: ");
        boolean nameFound = false;
        int index = 0;

        for (int i = 0; i < henkilot.size(); i++) {
            if (nimi.equals(henkilot.get(i).getNimi())) {
                nameFound = true;
                index = i;
            }
        }

        if (nameFound) {
            System.out.println("\nNimi: " + henkilot.get(index).getNimi());
            System.out.println("Osoite: " + henkilot.get(index).getOsoite());
            System.out.println("Pituus: " + henkilot.get(index).getKoko().getPituus());
            System.out.println("Painoindeksi: " + henkilot.get(index).getKoko().getPainoindeksi() + "\n");
        } else if (!nameFound) {
            System.out.println("\nHenkilöä ei ole\n");
        }
    }

    private void lisaaHenkilo() {
        String nimi, osoite;
        double pituus, paino;

        nimi = lukija.lueTeksti("Anna nimi: ");
        osoite = lukija.lueTeksti("Anna osoite: ");
        pituus = lukija.lueDesimaaliluku("Anna pituus: ");
        paino = lukija.lueKokonaisluku("Anna paino: ");
        System.out.println("\n");

        Koko koko = new Koko(pituus, (int)paino);

        Henkilo henkilo = new Henkilo(nimi, osoite, koko);
        henkilot.add(henkilo);
    }

    public static void main(String[] args) {
        new HenkiloListaSovellus();
    }

}


