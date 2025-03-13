package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil {
    private int id;
    private float salariul;

    public Asistent(String nume, int varsta, int id, float salariul) {
        super(nume, varsta);
        this.id = id;
        this.salariul = salariul;
    }

    public int getId() {
        return id;
    }

    public void setSalariul(float salariul) {
        this.salariul = salariul;
    }

    @Override
    public void preda() {
       StringBuilder builder = new StringBuilder();
       builder.append("Asistentul ").append(this.nume).append(" preda de obicei la seminar!");
       System.out.println(builder.toString());
    }

    @Override
    public float calculareVenit() {
        return salariul;
    }
}
