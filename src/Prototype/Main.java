package Prototype;

import java.util.Arrays;

/**
 * 기존 객체를 복제해서 새 객체를 생성하는 패턴
 * new를 쓰지 않고 새로운 인스턴스를 만드는 것이 핵심
 * Deep copy 로 복사하여 원본이 변경되지 않도록 하는것이 좋다.
 * 객체 생성 비용이 큰 경우 생성하면 좋음.(복잡한 초기화, DB 조회 등)
 */
public class Main {
    public static void main(String[] args) {
        Soldier template = new Soldier("Template", 10, "Spear");
        SoldierPrototype prototype = new SoldierPrototype(template);

        Soldier swordMan = prototype.cloneSoldier();
        swordMan.setName("SwordMan");
        swordMan.setDamage(5);
        swordMan.setWeapon("Sword");

        Soldier bowMan = prototype.cloneSoldier();
        bowMan.setName("BowMan");
        bowMan.setDamage(4);
        bowMan.setWeapon("Bow");

        System.out.println(template.toString());
        System.out.println(swordMan.toString());
        System.out.println(bowMan.toString());
    }
}
