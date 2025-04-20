package AbstractFactory.Desert;

import AbstractFactory.Obstacle;

public class Cactus implements Obstacle {
    @Override
    public void render() {
        System.out.println("선인장 생성");
    }
}
