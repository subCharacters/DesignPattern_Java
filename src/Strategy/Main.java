package Strategy;

import Strategy.weapons.Axe;
import Strategy.weapons.Knife;
import Strategy.weapons.Sword;

// 하나의 기능에 대해서 서로 다른 방식의 구현을 할때 전략 패턴을 사용
public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        // 무기를 새롭게 추가할 경우 새 클래스를 만들면 추가 로직 수정없이 가능.
        character.setWeapon(new Axe());
        character.attack();
    }
}
