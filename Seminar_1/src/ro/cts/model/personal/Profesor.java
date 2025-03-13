package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil {
    private int id;
    private float salariul;
    private float sporVechime;

    public Profesor(String nume, int varsta, int id, float salariul, float spor) {
        super(nume, varsta);
        this.id = id;
        this.salariul = salariul;
        this.sporVechime = spor;
    }



    @Override
    public float calculareVenit() {
        return salariul + (salariul * sporVechime);
    }

    @Override
    public void preda() {
       StringBuilder builder = new StringBuilder();
       builder.append("Profesorul ").append(this.nume).append(" preda la curs!");
       System.out.println(builder.toString());
    }
}
