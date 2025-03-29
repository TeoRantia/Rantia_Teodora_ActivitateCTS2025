package ro.cts.clase;

public class FactoryDesert implements AbstractFactory {
    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    public void setCantitate(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare createFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch (tipFelDeMancare) {
            case Deserturi.Tiramisu ->
            {
                return new Tiramisu(pret,calorii,crema);
            }
            case Deserturi.Papansi ->
            {return new Papnasi(pret,calorii,crema);}
            case null, default ->
            {
                return null;
            }
        }
    }


}
