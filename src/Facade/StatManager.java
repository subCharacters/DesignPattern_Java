package Facade;

public class StatManager {
    public static void increaseStats(Player player) {
        player.levelUp(); // 여기서 스탯도 증가했다고 가정
        System.out.println("📈 플레이어 능력치 증가");
    }
}
