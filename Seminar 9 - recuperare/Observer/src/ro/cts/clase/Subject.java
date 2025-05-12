package ro.cts.clase;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteMesaje(String mesaj);
}
