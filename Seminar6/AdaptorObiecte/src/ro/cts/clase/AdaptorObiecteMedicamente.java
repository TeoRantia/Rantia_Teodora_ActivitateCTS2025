package ro.cts.clase;

public class AdaptorObiecteMedicamente extends MedicamentFarmacie {
    MedicamentSpital medicamentSpital;

    public AdaptorObiecteMedicamente(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNumeMedicament(), "25.09.2025", medicamentSpital.getPret(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
