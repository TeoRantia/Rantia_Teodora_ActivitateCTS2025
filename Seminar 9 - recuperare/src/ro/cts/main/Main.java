//// PROBLEMA F.10 (STB) - Strategy
package ro.cts.main;

import ro.cts.clase.Calator;
import ro.cts.clase.CardCalatorie;
import ro.cts.clase.IMetodaPlata;
import ro.cts.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlataCardCalatorie = new CardCalatorie(1);

        Calator teo = new Calator("Teo", metodaPlataCardCalatorie);
        teo.platesteBilet(5);
        teo.setMetodaPlata(new PlataSMS());
        teo.platesteBilet(5);
        teo.setMetodaPlata(metodaPlataCardCalatorie);
        teo.platesteBilet(5);
    }
}
