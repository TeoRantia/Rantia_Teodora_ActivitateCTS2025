package ro.cts.clase;

public class AutoritateReglementareMasiniLazy {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoritateReglementareMasiniLazy instance = null;

    private AutoritateReglementareMasiniLazy(String nume, String webSite, int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void reglementeazaModel(String nume) {
        nrReglementari++;
    }

    public static synchronized AutoritateReglementareMasiniLazy getInstance(String nume, String webSite) {
        if(instance == null) {
            instance = new AutoritateReglementareMasiniLazy(nume, webSite, 0);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniLazy{" +
                "nume='" + nume + '\'' +
                ", webSite='" + webSite + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
