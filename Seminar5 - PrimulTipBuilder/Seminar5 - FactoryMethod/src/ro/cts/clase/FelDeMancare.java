package ro.cts.clase;

public class FelDeMancare {
    private float pret;
    private float nrCalorii;

    public FelDeMancare(float pret, float nrCalorii) {
        this.pret = pret;
        this.nrCalorii = nrCalorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelDeMancare{");
        sb.append("pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
