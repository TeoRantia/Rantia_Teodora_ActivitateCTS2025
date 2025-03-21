package ro.cts.clase;

public class SupaDeCocos extends Supa{
    public SupaDeCocos(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
