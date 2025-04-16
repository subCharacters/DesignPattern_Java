package Command;

// 타일에 경로 놓기
public class PlacePathCommand implements Command {
    private final TileMap tileMap;
    private final int x, y;

    public PlacePathCommand(TileMap tileMap, int x, int y) {
        this.tileMap = tileMap;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        tileMap.place(x, y);
    }

    @Override
    public void undo() {
        tileMap.remove(x, y);
    }
}
