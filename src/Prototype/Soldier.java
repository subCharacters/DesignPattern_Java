package Prototype;

public class Soldier {
    private String name;
    private int damage;
    private String weapon;

    public Soldier(String name, int damage, String weapon) {
        this.name = name;
        this.damage = damage;
        this.weapon = weapon;
    }

    public Soldier(Soldier other) {
        this.name = other.name;
        this.damage = other.damage;
        this.weapon = other.weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
