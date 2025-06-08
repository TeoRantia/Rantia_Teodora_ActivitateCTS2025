package ro.cts.dubluri;

import ro.cts.clase.IPersoana;

public class PersoanaStub implements IPersoana {
    @Override
    public String getSex() {
        return "";
    }

    @Override
    public int getVarsta() {
        return 0;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
