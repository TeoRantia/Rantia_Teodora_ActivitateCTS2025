package ro.cts.clase;

public class Sectie implements Structura{
//    Clasa frunza

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        throw new Exception("Functia de adaugare nu a fost implementata");
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        throw new Exception("Functia de stergere nu a fost implementata");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectia: " + this.nume);
    }

    @Override
    public Structura getStructura(int index) throws Exception {
        throw new Exception("Functia de cautare nu a fost implementata");
    }
}
