package Facade;

/**
 * 여러 객체의 복잡한 흐름을 숨기고 입구 하나로 통합된 간단한 메서드를 제공하는 패턴.
 * 예를 들어 게임에서 레벨업을 하면
 * 레벨업 효과음, 이펙트, 스탯 증가, 애니메이션 재생이 필요하다면
 * 해당 메서드를 하나로 모아서 레벨업이라는 메서드를 따로 만들면 된다.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player("player", "X:100, Y:100");
        LevelUpFacade facade = new LevelUpFacade();

        // 한 줄로 레벨업 처리.
        facade.levelUp(player);
    }
}
