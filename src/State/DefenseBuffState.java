package State;

public class DefenseBuffState implements PlayerState {
    @Override
    public void takeDamage(Player player, int damage) {
        int reduced = damage / 2;
        player.reduceHp(reduced);
        System.out.println("일반 상태: " + reduced + " 피해를 입음" );
    }
}
