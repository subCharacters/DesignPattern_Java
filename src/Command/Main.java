package Command;

/**
 * 명령을 객체로 만들어 캡슐화 하여 요청자와 실행자를 분리하는 패턴
 * Undo/Redo, 명령 큐, 로그 기록 등에 유용
 */
public class Main {
    public static void main(String[] args) {
        // 맵 크기 생성
        TileMap map = new TileMap(5, 3);
        // 관리자 생성
        CommandManager manager = new CommandManager();

        manager.executeCommand(new PlacePathCommand(map, 1, 1));
        manager.executeCommand(new PlacePathCommand(map, 2, 1));
        manager.executeCommand(new PlacePathCommand(map, 3, 1));
        map.print();

        System.out.println("Undo");
        manager.undo();
        map.print();

        System.out.println("Undo");
        manager.undo();
        map.print();

        System.out.println("Undo");
        manager.undo();
        map.print();

        System.out.println("Redo");
        manager.redo();
        map.print();

        System.out.println("Redo");
        manager.redo();
        map.print();
    }
}
