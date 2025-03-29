package ro.cts.clase;

public class Rezervare {
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScaunErg;
    private boolean hasMasaDecorata;
    private String genMuzica;

    protected Rezervare(String numeClient, boolean hasAsezareGeam, boolean hasScaunErg, boolean hasMasaDecorata, String genMuzica) {
        this.numeClient = numeClient;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasScaunErg = hasScaunErg;
        this.hasMasaDecorata = hasMasaDecorata;
        this.genMuzica = genMuzica;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    protected void setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
    }

    protected void setHasScaunErg(boolean hasScaunErg) {
        this.hasScaunErg = hasScaunErg;
    }

    protected void setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
    }

    protected void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasAsezareGeam=").append(hasAsezareGeam);
        sb.append(", hasScaunErg=").append(hasScaunErg);
        sb.append(", hasMasaDecorata=").append(hasMasaDecorata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
