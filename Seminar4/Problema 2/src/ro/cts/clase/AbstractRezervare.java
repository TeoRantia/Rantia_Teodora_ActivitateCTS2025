package ro.cts.clase;

public abstract class AbstractRezervare {
    protected int nrParticipanti;
    protected int ora;
    protected String numeClient;
    protected int ziuaLunii;

    public AbstractRezervare(){
        this.nrParticipanti = 5;
        this.numeClient = "Cristian";
        this.ora = 16;
        this.ziuaLunii = 24;
    }



    public AbstractRezervare(int nrParticipanti, int ora, String numeClient, int ziuaLunii) {
        if(nrParticipanti < 2)
        {
            this.nrParticipanti = 2;
        }
        else {
            this.nrParticipanti = nrParticipanti;
        }
        if(ora >= 10 && ora <= 22)
        {
            this.ora = ora;
        }
        else
        {
            this.ora = 12;
        }
        if(numeClient.length()>2)
        {
            this.numeClient = numeClient;
        }
        else
        {
            this.numeClient = "Anonim";
        }
        if(this.ziuaLunii > 31)
        {
            this.ziuaLunii = 31;

        }
        else
        {
            this.ziuaLunii = ziuaLunii;
        }
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRezervare{");
        sb.append("nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }

    public AbstractRezervare copiaza(int ZiuaLunii){
        return null;
    }

    public void setNrParticipanti(int nrParticipanti) {
        this.nrParticipanti = nrParticipanti;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setZiuaLunii(int ziuaLunii) {
        this.ziuaLunii = ziuaLunii;
    }
}
