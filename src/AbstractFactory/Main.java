package AbstractFactory;

/**
 * 구성될 컴포넌트들은 명확하지만 상세가 정해지지 않을 때 사용하는 패턴.
 * 예를 들어 GUI의 경우 버튼과 입력칸, 체크박스등은 필요하지만, 모바일UI인지 맥UI인지등 정해지지 않았을때
 * 컴포넌트를 조합해서 완성품을 만든다고 생각하면 편할듯.
 *
 * 예제는 맵을 테마별로 생성하는 예제이다.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("🏜️ 사막 맵 생성 중...");
        MapGenerator desertMap = new MapGenerator(new DesertMapFactory());
        desertMap.generateMap();

        System.out.println("\n❄️ 얼음 맵 생성 중...");
        MapGenerator iceMap = new MapGenerator(new IceMapFactory());
        iceMap.generateMap();
    }
}
