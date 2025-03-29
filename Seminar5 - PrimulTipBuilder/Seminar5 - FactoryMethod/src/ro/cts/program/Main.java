package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        FactorySupa fabricaSupe = new FactorySupa(100);
        FactoryDesert fabricaDesert = new FactoryDesert("Zmeura");
        FelDeMancare supaDeCiuperci = fabricaSupe.createFelDeMancare(Supe.supaDeCiuperci,10,20);
        fabricaSupe.setCantitate(300);
        FelDeMancare supaDeLegume = fabricaSupe.createFelDeMancare(Supe.supaDeLegume,200,12);
        FelDeMancare tiramisu = fabricaDesert.createFelDeMancare(Deserturi.Tiramisu,300,12);
        FelDeMancare papanasi = fabricaDesert.createFelDeMancare(Deserturi.Papansi,400,12);
        System.out.println(supaDeCiuperci);
        System.out.println(supaDeLegume);
        System.out.println(tiramisu);
        System.out.println(papanasi);
    }
}
