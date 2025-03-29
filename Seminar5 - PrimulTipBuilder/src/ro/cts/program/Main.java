package ro.cts.program;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder("Tudor");
        Rezervare rezervare = builder.setHasScaunErg(true).setGenMuzica("Dance").build();
        Rezervare rezervare1 = builder.setGenMuzica("Rock").build();
        System.out.println(rezervare);
        System.out.println(rezervare1);

    }
}
