package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;
//la importarea clasei, se creeaza in memorie aceasta clasa + atributele statice, motiv pt care
//se creeaza si instanta. Daca noi nu apelam getInstance, aceasta nu e extrasa, dar ea exista, ceea ce e o prob
//Solutia e lazy initialization

//La lucrare NU o sa se specifice clar daca avem nevoie de Eager, Lazy sau Multi-thread initialization

public class Main {
    public static void main(String[] args) {
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebSite("www.siteNou");
        System.out.println(autoritate2);

        autoritate2.reglementeazaModel("DaciaLogan");
        System.out.println(autoritate);



        AutoritateReglementareMasiniLazy autoLazy = AutoritateReglementareMasiniLazy.getInstance("Autoritate Lazy 1", "www.website1.ro");
        System.out.println(autoLazy);

        AutoritateReglementareMasiniLazy autoLazy2 = AutoritateReglementareMasiniLazy.getInstance("Autoritate Lazy 2", "www.website2.ro");
        System.out.println(autoLazy2);
    }
}
