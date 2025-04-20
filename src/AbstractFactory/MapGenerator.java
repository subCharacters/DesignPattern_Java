package AbstractFactory;

public class MapGenerator {
    private final MapFactory mapFactory;

    public MapGenerator(MapFactory mapFactory) {
        this.mapFactory = mapFactory;
    }

    public void generateMap() {
        Tile tile = mapFactory.createTile();
        Obstacle obstacle = mapFactory.createObstacle();
        Monster monster = mapFactory.createMonster();

        tile.render();
        obstacle.render();
        monster.move();
    }
}
