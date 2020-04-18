package observer;

import java.util.LinkedList;
import java.util.List;

public class DecimalSubject implements Subject {
    private List<Observer> observers = new LinkedList<>();

    private int decimalValue;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void announce() {
        for (Observer ob : observers) {
            ob.update();
        }
    }

    public int get() {
        return decimalValue;
    }

    public void setDecimalValue(int decimalValue) {
        this.decimalValue = decimalValue;
        announce();
    }
}
