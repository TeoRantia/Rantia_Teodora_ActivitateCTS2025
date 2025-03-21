package ro.cts.clase;

public class RezervareTerasa extends AbstractRezervare{
    private boolean esteFumator;


    public RezervareTerasa(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteFumator = esteFumator;
    }

    public RezervareTerasa(){
        super();
    }

    @Override
    public AbstractRezervare copiaza(int ziuaLunii) {
        RezervareTerasa rezervare = new RezervareTerasa();
        rezervare.esteFumator = false;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.numeClient = this.numeClient;
        rezervare.ora = this.ora;
        rezervare.ziuaLunii = this.ziuaLunii;

        return rezervare;
    }
}
