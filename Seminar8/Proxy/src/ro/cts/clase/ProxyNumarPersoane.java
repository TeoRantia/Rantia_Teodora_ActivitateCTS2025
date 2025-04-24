package ro.cts.clase;

public class ProxyNumarPersoane implements IRezervare{
    private IRezervare rezervare;

    public ProxyNumarPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String nume, int numarPersoane, int ora) {
        if(numarPersoane >= 4) {
            this.rezervare.rezerva(nume, numarPersoane, ora);
        } else {
            System.out.println("Va asteptam in restaurant!");
        }
    }
}
