package ro.cts.clase;

public class PlataSMS implements IMetodaPlata {
    //private float credit;

    public PlataSMS() {
        //this.credit = credit;
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ai platit prin SMS.");
    }
}
