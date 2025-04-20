package AbstractFactory.IceLand;

import AbstractFactory.Monster;

public class Penguin implements Monster {
    @Override
    public void move() {
        System.out.println("펭귄 이동");
    }
}
