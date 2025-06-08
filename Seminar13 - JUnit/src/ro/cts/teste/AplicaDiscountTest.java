package ro.cts.teste;

import org.junit.experimental.categories.Category;
import ro.cts.categorii.CategorieBoundary;
import ro.cts.categorii.CategorieRight;
import ro.cts.clase.IPersoana;
import ro.cts.clase.PachetTuristic;
import ro.cts.dubluri.PersoanaFake;
import ro.cts.dubluri.PersoanaStub;

import static org.junit.Assert.assertEquals;

public class AplicaDiscountTest {

    @org.junit.Test
    @Category(CategorieBoundary.class)
    public void aplicaDiscountVarstnicBoundaryTest() {
        IPersoana persoana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 500.0);
        pachetTuristic.aplicaDiscountVarstnic(15);
        assertEquals(425, pachetTuristic.getPret(), 0.001);
    }

    @org.junit.Test
    @Category(CategorieRight.class)
    public void aplicaDiscountVarstnicRightOVerTest() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(66);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bali", 600.0);
        pachetTuristic.aplicaDiscountVarstnic(10);
        assertEquals(540, pachetTuristic.getPret(), 0.001);
    }

    @org.junit.Test
    @Category(CategorieRight.class)
    public void aplicaDiscountVarstnicRightUnderTest() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(22);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bali", 600.0);
        pachetTuristic.aplicaDiscountVarstnic(10);
        assertEquals(600, pachetTuristic.getPret(), 0.001);
    }
}