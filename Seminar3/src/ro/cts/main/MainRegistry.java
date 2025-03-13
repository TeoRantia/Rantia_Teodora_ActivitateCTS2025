package ro.cts.main;

import ro.cts.registry.Autoritate;
import ro.cts.registry.Reglementare;

public class MainRegistry {
    public static void main(String[] args) {
        Autoritate autoritate = Autoritate.getInstance("Autoritate", "www.autoritateMare.ro");
        Reglementare reglementare = autoritate.reglementeazaModel("Logan");
        Reglementare reglementare2 = autoritate.reglementeazaModel("Cybertruck");
        System.out.println(reglementare);
        System.out.println(reglementare2);

        Reglementare reglementare3 = autoritate.reglementeazaModel("Logan");
        System.out.println(reglementare3);
    }
}
