package Strategy;

import Strategy.weapons.IWeapon;

public class Character {

    private IWeapon weapon;

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    // 델리게이트
    public void attack() {
        if (weapon == null) {
            System.out.println("fist");
        } else {
            weapon.attack();
        }
    }
}
