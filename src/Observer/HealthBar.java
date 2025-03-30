package Observer;

public class HealthBar implements Observer {

    @Override
    public void onHealthChanged(int hp) {
        System.out.println("HealthBar health: " + hp);
    }
}
