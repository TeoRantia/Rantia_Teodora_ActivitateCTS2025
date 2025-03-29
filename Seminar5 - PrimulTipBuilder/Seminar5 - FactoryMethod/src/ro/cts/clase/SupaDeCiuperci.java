package ro.cts.clase;

public class SupaDeCiuperci extends FelDeMancare{
    private int cantiate;


    public SupaDeCiuperci(float pret, float nrCalorii, int cantiate) {
        super(pret, nrCalorii);
        this.cantiate = cantiate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"SupaDeCiuperci{");
        sb.append("cantiate=").append(cantiate);
        sb.append('}');
        return sb.toString();
    }
}
