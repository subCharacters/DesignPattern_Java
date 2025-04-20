package AbstractFactory;

public interface MapFactory {
    Tile createTile();
    Obstacle createObstacle();
    Monster createMonster();
}
