//// PROBLEMA A.8 (Spital) - Composite
package ro.cts.main;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura departament1 = new Departament("ICU", 34);
        Structura departament2 = new Departament("Pediatrie", 10);
        Structura departament3 = new Departament("General", 50);

        Sectie sectia1 = new Sectie("sectie1");
        Sectie sectia2 = new Sectie("sectie2");
        Sectie sectia3 = new Sectie("sectie3");

        try {
            departament3.adaugaStructura(departament1);
            departament3.adaugaStructura(departament2);

            departament2.adaugaStructura(sectia2);
            departament1.adaugaStructura(sectia1);
            departament3.adaugaStructura(sectia3);

            departament3.afiseazaDescriere();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
