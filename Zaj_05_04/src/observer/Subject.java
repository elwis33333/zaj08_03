package observer;

public interface Subject {
    void addObserver(Observer observer);
    void delObserver(Observer observer);
    void announce();
    int get();
}
