package Observer;

public class Logger implements Observer {

    @Override
    public void onHealthChanged(int hp) {
        System.out.println(hp);
    }
}
