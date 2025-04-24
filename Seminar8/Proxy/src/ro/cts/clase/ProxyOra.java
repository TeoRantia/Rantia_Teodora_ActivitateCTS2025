package ro.cts.clase;

import javax.swing.*;

public class ProxyOra implements IRezervare{
    private IRezervare rezervare;

    public ProxyOra(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String nume, int numarPersoane, int ora) {
        if(ora >= 18) {
            this.rezervare.rezerva(nume, numarPersoane, ora);
        } else {
            System.out.println("Nu este nevoie de rezervare");
        }
    }
}
