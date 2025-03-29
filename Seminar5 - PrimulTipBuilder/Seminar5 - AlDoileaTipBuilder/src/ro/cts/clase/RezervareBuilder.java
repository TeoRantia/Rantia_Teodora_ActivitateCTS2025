package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder {

    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScaunErg;
    private boolean hasMasaDecorata;
    private String genMuzica;

    public RezervareBuilder() {
        hasAsezareGeam = false;
        hasScaunErg = false;
        hasMasaDecorata = false;
        genMuzica = "Fara muzica";
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
        return this;
    }

    public RezervareBuilder setHasScaunErg(boolean hasScaunErg) {
        this.hasScaunErg = hasScaunErg;
        return this;
    }

    public RezervareBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build( String numeClient) {
        return new Rezervare(numeClient,hasAsezareGeam,hasScaunErg,hasMasaDecorata,genMuzica);
    }
}
