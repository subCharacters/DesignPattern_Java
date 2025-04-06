package Prototype;

public class SoldierPrototype {
    private Soldier soldier;

    public SoldierPrototype(Soldier soldier) {
        this.soldier = soldier;
    }

    public Soldier cloneSoldier() {
        return new Soldier(soldier);
    }
}
