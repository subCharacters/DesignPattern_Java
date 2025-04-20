package Visitor;

import java.util.List;

/**
 * 데이터 구조와 데이터 처리를 분리해주는 패턴.
 * 데이터는 그대로 두고, 동작만 외부에서 덧붙이고 싶을 때 사용하는 패턴
 * 데이터 처리 방식을 기존의 소스 코드 변경 없이 새로운 클래스 추가만으로 확장 할 수 있음.
 */
public class Main {
    public static void main(String[] args) {
        List<DocumentVisitable> parts = List.of(
                new Text("안녕하세요."),
                new Image("cat.jpg"),
                new Text("방문자"),
                new Text("디자인"),
                new Text("패턴!"),
                new Image("dog.jpg")
        );

        DocumentVisitor printer = new PrintVisitor();

        for (DocumentVisitable part : parts) {
            part.accept(printer);
        }

    }
}
