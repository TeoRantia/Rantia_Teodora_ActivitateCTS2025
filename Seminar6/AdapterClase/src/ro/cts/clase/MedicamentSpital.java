package ro.cts.clase;

public class MedicamentSpital {
    private String numeMedicament;
    private float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + this.numeMedicament + " este achizitionat la pretul " + this.pret);
    }

    public void prezintaReteta() {
        System.out.println("Este prezentata reteta pt medicamentul " + this.numeMedicament);
    }
}