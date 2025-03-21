package ro.cts.program;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareInterior;
import ro.cts.clase.RezervareTerasa;

public class Program {
    public static void main(String[] args){
        AbstractRezervare rezervareTerasa = new RezervareTerasa(12, 15, "Mihai", 24, true);
        AbstractRezervare rezervareTerasa2 = rezervareTerasa.copiaza(30);
        AbstractRezervare rezervareTerasa3 = rezervareTerasa.copiaza(26);
        rezervareTerasa3.setZiuaLunii(12);

        System.out.println(rezervareTerasa.toString());
        System.out.println(rezervareTerasa2.toString());
        System.out.println(rezervareTerasa3.toString());
    }
}
