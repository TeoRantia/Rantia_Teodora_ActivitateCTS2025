package ro.cts.clase;

public class Masa {
    private boolean esteLibera;
    private int numarMasa;
    private int numarPersoane;

    public Masa(boolean esteLibera, int numarMasa, int numarPersoane) {
        this.esteLibera = esteLibera;
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }
}
