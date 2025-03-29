package ro.cts.clase;

public interface AbstractFactory {
    public FelDeMancare createFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii);
}
