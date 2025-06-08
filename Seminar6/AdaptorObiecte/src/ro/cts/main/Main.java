package ro.cts.main;

import ro.cts.clase.AdaptorObiecteMedicamente;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        System.out.println("Bine ati venit la farmacia Dr. Max");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("medicament 1", "03.09.2026",
                125.74f, true);

        vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("medicament 2", 118.99f);

        AdaptorObiecteMedicamente adaptorObiecte = new AdaptorObiecteMedicamente(medicamentSpital);
        vindeMedicament(adaptorObiecte);
    }
}
