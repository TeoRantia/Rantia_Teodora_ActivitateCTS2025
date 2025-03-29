package ro.cts.program;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder Builder = new RezervareBuilder();
        Rezervare Rezervare = Builder.setGenMuzica("Dance").setHasAsezareGeam(true).build("Popica");
        Rezervare Rezervare2=Builder.setHasScaunErg(true).build("Marius");
        System.out.println(Rezervare.toString());
        System.out.printf(Rezervare2.toString());

    }
}
