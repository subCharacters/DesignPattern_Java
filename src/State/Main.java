package State;

/**
 * 상태를 객체화 하는 패턴
 * if문을 효과적으로 줄일 수 있는 패턴이다.
 *
 * 해당 예제는 캐릭터가 일반, 무적, 방업 상태일때 피격 데미지가 바뀌는 예제이다.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        int damage = 10;

        player.takeDamage(damage); // 일반 상태

        player.setState(new InvincibleState());
        player.takeDamage(damage); // 무적 상태

        player.setState(new DefenseBuffState());
        player.takeDamage(damage); // 방어 버프 상태

        player.setState(new NormalState());
        player.takeDamage(damage); // 다시 일반 상태
    }
}
