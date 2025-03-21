package ro.cts.clase;

public class RezervareInterior extends AbstractRezervare{
    private boolean esteLaParter;

    public RezervareInterior(){
        super();
    }

    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteLaParter = esteLaParter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("esteLaParter=").append(esteLaParter);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public AbstractRezervare copiaza(int ziuaLunii) {
        RezervareInterior rezervare = new RezervareInterior();
        rezervare.ora = this.ora;
        rezervare.ziuaLunii = this.ziuaLunii;
        rezervare.numeClient = this.numeClient;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.esteLaParter = true;

        return rezervare;
    }
}
