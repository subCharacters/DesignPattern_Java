package State;

public class InvincibleState implements PlayerState{
    @Override
    public void takeDamage(Player player, int damage) {
        System.out.println("무적 상태: " + 0 + " 피해를 입음" );
    }
}
