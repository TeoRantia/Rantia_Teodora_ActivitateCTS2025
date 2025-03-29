package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder{

    private Rezervare instance;

    public RezervareBuilder(String numeClient) {
        instance= new Rezervare(numeClient,false,false,false,"Fara muzica");
    }

    @Override
    public Rezervare build() {
        return instance;
    }

    public RezervareBuilder setHasScaunErg(boolean hasScaunErg) {
        instance.setHasScaunErg(hasScaunErg);
        return this;
    }
    public RezervareBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        instance.setHasMasaDecorata(hasMasaDecorata);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica) {
        instance.setGenMuzica(genMuzica);
        return this;
    }


}
