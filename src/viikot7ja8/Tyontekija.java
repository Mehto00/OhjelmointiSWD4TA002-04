
/*
Tehtävänanto:
Tee Tyontekija -luokkaan parametriton ja parametrillinen konstruktori.
Parametrilliselle konstruktorille annetaan parametrina nimi, osoite ja tuntipalkka.
Tee Tyontekija -luokkaan tuntipalkka -attribuutille get- ja set -metodit sekä toString -metodi.
Tee pääohjelma TyontekijaOhjelma, missä Tyontekija -luokan olio luodaan parametrittomalla
konstruktorilla. Muuta työntekijän tiedot set -metodeilla. Näytä tiedot get -metodeilla.
*/

package viikot7ja8;

public class Tyontekija extends Henkilo {

    // === Properties === //
    private double tuntipalkka;

    // === Constructors === //
    public Tyontekija() {
        super();
    }

    public Tyontekija(String nimi, String osoite, double tuntipalkka) {
        super(nimi, osoite);
        this.tuntipalkka = tuntipalkka;
    }

    // === Getters / Setters === //
    public double getTuntipalkka() {
        return tuntipalkka;
    }

    public void setTuntipalkka(double tuntipalkka) {
        this.tuntipalkka = tuntipalkka;
    }

    // === toString === //
    @Override
    public String toString() {
        return "Tyontekija{" +
                "tuntipalkka=" + tuntipalkka +
                '}' + super.toString();
    }
}
