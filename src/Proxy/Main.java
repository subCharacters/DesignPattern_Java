package Proxy;

/**
 * 어떤 객체에 직접 접근 하지 않고 그 객체를 대신해서 행동하는 대리객체(프록시)를 두는 패턴.
 * 원래 객체가 지연 로딩, 접근 제어등을 위해 중간에 끼는 객체가 존재.
 *
 * 지연 로딩:	무거운 객체를 나중에 필요할 때 생성
 * 접근 제어:	권한이 있어야 접근 가능하게 하기
 * 로깅/모니터링:	진짜 객체 실행 전후로 로그 찍기
 * 네트워크 프록시:	원격 객체 대신 요청 처리 (RMI, WebService 등)
 */
public class Main {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("image1.jpg");
        Image image2 = new ImageProxy("image2.svg");

        System.out.println("이미지 출력");
        System.out.println("처음 출력");
        image1.display();
        System.out.println("두 번째 출력 (캐싱)");
        image1.display();

        System.out.println("이미지 출력");
        image2.display();
    }
}
