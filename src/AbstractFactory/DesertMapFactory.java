package AbstractFactory;

import AbstractFactory.Desert.Cactus;
import AbstractFactory.Desert.SandTile;
import AbstractFactory.Desert.Scorpion;

public class DesertMapFactory implements MapFactory {
    @Override
    public Tile createTile() {
        return new SandTile();
    }

    @Override
    public Obstacle createObstacle() {
        return new Cactus();
    }

    @Override
    public Monster createMonster() {
        return new Scorpion();
    }
}
