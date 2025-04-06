package ro.cts.AdaptorClase.main;

import ro.cts.AdaptorClase.clase.AdaptorClaseMedicament;
import ro.cts.AdaptorClase.clase.Farmacie;
import ro.cts.AdaptorClase.clase.MedicamentFarmacie;
import ro.cts.AdaptorClase.clase.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");

        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("ParaSinus", "05.05.2026",
                22.3f, true);

        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Nurofen", "06.04.2027",
                13.5f, true);

        farmacie.vindeMedicament(medicamentFarmacie1);
        farmacie.vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Med spital", 10.25f);
        AdaptorClaseMedicament adaptorClaseMedicament = new AdaptorClaseMedicament("Paracetamol", 7.8f);
        farmacie.vindeMedicament(adaptorClaseMedicament);
    }
}
