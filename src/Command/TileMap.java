package Command;

// 실제 맵
public class TileMap {
    private final String[][] map;
    public TileMap(int width, int height) {
        map = new String[height][width];
        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                map[i][j] = " ";
    }

    public void place(int x, int y) {
        map[y][x] = "X";
    }

    public void remove(int x, int y) {
        map[y][x] = " ";
    }

    public void print() {
        for (String[] row : map) {
            for (String cell : row) {
                System.out.print("[" + cell + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
}
