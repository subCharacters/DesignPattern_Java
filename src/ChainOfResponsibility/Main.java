package ChainOfResponsibility;

/**
 * 여러개의 책임들을 동적으로 연결해서 순차적으로 실행하는 패턴.
 * 기능을 클래스별로 분리해석 구현.
 * 예)URL 분석 -> 프로토콜 책임 -> 도메인 책임 -> 포트 책임
 */
public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new PortHandler();
        Handler handler3 = new DomainHandler();

        handler1.setNextHandler(handler2).setNextHandler(handler3);

        String url = "http://www.google.com:8080";
        System.out.println("INPUT: " + url);

        handler1.run(url);
    }
}
