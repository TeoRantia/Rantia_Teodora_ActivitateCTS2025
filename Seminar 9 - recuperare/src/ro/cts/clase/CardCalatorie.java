package ro.cts.clase;

public class CardCalatorie implements IMetodaPlata {
    private int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrCalatoriiRamase > 0) {
            System.out.println("Ai platit cu cardul de calatorii.");
            nrCalatoriiRamase -= 1;
        }
        else {
            System.out.println("Nu mai ai calatorii ramase!");
        }
    }
}
