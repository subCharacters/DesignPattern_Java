package AbstractFactory;

import AbstractFactory.IceLand.IceTile;
import AbstractFactory.IceLand.Penguin;
import AbstractFactory.IceLand.Snowman;

public class IceMapFactory implements MapFactory{
    @Override
    public Tile createTile() {
        return new IceTile();
    }

    @Override
    public Obstacle createObstacle() {
        return new Snowman();
    }

    @Override
    public Monster createMonster() {
        return new Penguin();
    }
}
