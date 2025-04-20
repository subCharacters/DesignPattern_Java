package AbstractFactory.IceLand;

import AbstractFactory.Tile;

public class IceTile implements Tile {
    @Override
    public void render() {
        System.out.println("얼음 타일 생성");
    }
}
