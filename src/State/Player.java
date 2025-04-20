package State;

public class Player {
    private int hp = 100;
    private PlayerState state;

    public Player() {
        this.state = new NormalState(); // 초기 상태
    }

    public void setState(PlayerState state) {
        this.state = state;
        System.out.println("➡ 상태 변경: " + state.getClass().getSimpleName());
    }

    public void takeDamage(int amount) {
        state.takeDamage(this, amount);
        System.out.println("❤️ 현재 HP: " + hp);
        System.out.println();
    }

    public void reduceHp(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0;
    }
}
