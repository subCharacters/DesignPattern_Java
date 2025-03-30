package Observer;

public class Main {
    /*
        subject가 관찰자(observer)에게 자신의 상태 변화를 알리는 패턴
        subject는 observer를 알지 못하거나 신호를 수신한 observer가 무엇을 하는지 신경 안씀.
        옵저버 패턴은 객체 간 일대다(1:N) 의존 관계를 정의하여, 한 객체의 상태 변화가 관련 객체에 자동으로 전파되도록 한다.
     */
    public static void main(String[] args) {
        Player player = new Player(100);
        HealthBar healthBar = new HealthBar();
        player.addObserver(healthBar);

        Logger logger = new Logger();
        player.addObserver(logger);

        player.takeDamage(5);
        player.takeDamage(15);
    }
}
