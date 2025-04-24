package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyNumarPersoane;
import ro.cts.clase.ProxyOra;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Gigel", 5, 15);

        IRezervare proxy = new ProxyNumarPersoane(rezervare);
        proxy.rezerva("Gigel", 3, 15);

        IRezervare proxyOra = new ProxyOra(proxy); // punem conditie si pe ora si pe nr de pers
        proxyOra.rezerva("Gigel", 6, 19);
    }
}
