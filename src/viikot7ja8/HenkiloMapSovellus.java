
/*
Tehtävänanto:
Tee ohjelmasta HenkiloListaSovellus HenkiloMapSovellus eli tee
edellinen tehtävä uudelleen käyttäen ArrayListan sijasta HashMappia.
*/

package viikot7ja8;

import java.util.*;

public class HenkiloMapSovellus {

    private Lukija lukija = new Lukija();
    private HashMap<String, Henkilo> mapHenkilot = new HashMap<>();

    public HenkiloMapSovellus(){
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
        Set<String> mapHenkilotNames = mapHenkilot.keySet();
        Iterator<String> i = mapHenkilotNames.iterator();
        while(i.hasNext()) {
            System.out.println(mapHenkilot.get(i.next()));
        }
    }

    private void muutaHenkilonKoko() {
        String nimi = lukija.lueTeksti("Anna kokoa muutettavan henkilön nimi: ");

        if (mapHenkilot.containsKey(nimi)) {
            Double newHeight = lukija.lueDesimaaliluku("Anna pituus: ");
            mapHenkilot.get(nimi).getKoko().setPituus(newHeight);
            int newWeight = lukija.lueKokonaisluku("Anna paino: ");
            mapHenkilot.get(nimi).getKoko().setPaino(newWeight);
        } else if (!mapHenkilot.containsKey(nimi)) {
            System.out.println("Henkilöä ei ole\n");
        }
    }

    private void muutaHenkilonNimiJaOsoite() {
        String nimi = lukija.lueTeksti("Anna perustietoja muutettavan henkilön nimi: ");

        if (mapHenkilot.containsKey(nimi)) {
            String newName = lukija.lueTeksti("Anna nimi: ");
            mapHenkilot.get(nimi).setNimi(newName);
            String newAddress = lukija.lueTeksti("Anna osoite: ");
            mapHenkilot.get(nimi).setOsoite(newAddress);
        } else if (!mapHenkilot.containsKey(nimi)) {
            System.out.println("Henkilöä ei ole\n");
        }
    }

    private void naytaHenkilo() {
        String nimi = lukija.lueTeksti("Anna näytettävän henkilön nimi: ");

        if (mapHenkilot.containsKey(nimi)) {
            System.out.println(mapHenkilot.get(nimi));
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
        mapHenkilot.put(henkilo.getNimi(), henkilo);

    }

    public static void main(String[] args) {
        new HenkiloListaSovellus();
    }
}
