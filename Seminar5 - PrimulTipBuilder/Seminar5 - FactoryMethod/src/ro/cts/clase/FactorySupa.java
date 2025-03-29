package ro.cts.clase;

public class FactorySupa implements AbstractFactory{

    private int cantitate;

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare createFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch (tipFelDeMancare)
        {
            case Supe.supaDeLegume->
            {return new SupaDeLegume(pret,calorii,cantitate);}
            case Supe.supaDeCiuperci->
            {
                return new SupaDeCiuperci(pret,calorii,cantitate);
            }
            case null, default -> {
            return null;
        }
         }
    }
}
