package State;

public class NormalState implements PlayerState {
    @Override
    public void takeDamage(Player player, int damage) {
        player.reduceHp(damage);
        System.out.println("일반 상태: " + damage + " 피해를 입음" );
    }
}
