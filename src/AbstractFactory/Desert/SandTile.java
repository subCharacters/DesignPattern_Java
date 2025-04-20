package AbstractFactory.Desert;

import AbstractFactory.Tile;

public class SandTile implements Tile {
    @Override
    public void render() {
        System.out.println("모래 타일 생성");
    }
}
