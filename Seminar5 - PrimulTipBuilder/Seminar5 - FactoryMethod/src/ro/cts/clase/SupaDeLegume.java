package ro.cts.clase;

public class SupaDeLegume extends FelDeMancare {
    private int cantitate;

    public SupaDeLegume(float pret, float nrCalorii, int cantitate) {
        super(pret, nrCalorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
