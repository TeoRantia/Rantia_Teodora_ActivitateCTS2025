package ro.cts.clase;

public class Rezervare implements IRezervare{

    @Override
    public void rezerva(String nume, int numarPersoane, int ora) {
        System.out.println(nume + " are o rezervare de " + numarPersoane + " persoane, la ora " + ora);
    }
}
