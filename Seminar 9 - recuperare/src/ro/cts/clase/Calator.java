package ro.cts.clase;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        metodaPlata = new CardBancar(10); //mod implicit card bancar
    }

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata; //mod de plata specificat de utilizator in main
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(float pretBilet) {
        metodaPlata.plateste(pretBilet);
    }
}
