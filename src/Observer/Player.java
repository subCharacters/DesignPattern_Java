package Observer;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Observer> observers = new ArrayList<Observer>();
    private int hp;

    public Player(int hp) {
        this.hp = hp;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        notifyObserver();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObserver() {
        for (Observer observer : observers) {
            observer.onHealthChanged(hp);
        }
    }
}
