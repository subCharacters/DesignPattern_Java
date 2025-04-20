package AbstractFactory.IceLand;

import AbstractFactory.Obstacle;

public class Snowman implements Obstacle {
    @Override
    public void render() {
        System.out.println("눈사람 생성");
    }
}
