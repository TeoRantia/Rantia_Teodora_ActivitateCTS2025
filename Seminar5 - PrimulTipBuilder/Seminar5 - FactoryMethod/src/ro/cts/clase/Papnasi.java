package ro.cts.clase;

public class Papnasi extends FelDeMancare{
    private String crema;

    public Papnasi(float pret, float nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Papnasi{");
        sb.append("crema='").append(crema).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
