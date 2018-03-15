
/*
Tehtävänanto:
Tee Tyontekija -luokkaan parametriton ja parametrillinen konstruktori.
Parametrilliselle konstruktorille annetaan parametrina nimi, osoite ja tuntipalkka.
Tee Tyontekija -luokkaan tuntipalkka -attribuutille get- ja set -metodit sekä toString -metodi.
Tee pääohjelma TyontekijaOhjelma, missä Tyontekija -luokan olio luodaan parametrittomalla
konstruktorilla. Muuta työntekijän tiedot set -metodeilla. Näytä tiedot get -metodeilla.
*/

package viikot7ja8;

import java.util.HashMap;

public class TyontekijaOhjelma {
    private Lukija lukija = new Lukija();
    private HashMap<String, Tyontekija> mapTyontekijat = new HashMap<>();

    private TyontekijaOhjelma() {
        Tyontekija tyontekija = new Tyontekija();

        tyontekija.setNimi(lukija.lueTeksti("Anna nimi: "));
        tyontekija.setOsoite(lukija.lueTeksti("Anna osoite: "));
        tyontekija.setTuntipalkka(lukija.lueDesimaaliluku("Anna tuntipalkka: "));

        String nimi = tyontekija.getNimi();
        mapTyontekijat.put(nimi, tyontekija);

        System.out.println("Nimi " + mapTyontekijat.get(nimi).getNimi());
        System.out.println("Osoite " + mapTyontekijat.get(nimi).getOsoite());
        System.out.println("Tuntipalkka " + mapTyontekijat.get(nimi).getTuntipalkka());
    }

    public static void main(String[] args) {
        new TyontekijaOhjelma();
    }







}
