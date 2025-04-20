package AbstractFactory.Desert;

import AbstractFactory.Monster;

public class Scorpion implements Monster {
    @Override
    public void move() {
        System.out.println("스콜피온 이동");
    }
}
