package ro.cts.AdaptorClase.clase;


public class Farmacie {
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie) {
        System.out.println("La farmacia " + this.numeFarmacie);
        medicamentFarmacie.cumparaMedicament();
    }
}
