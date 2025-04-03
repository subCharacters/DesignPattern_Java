package Decorator;

/**
 * 기능을 장식처럼 계속 추가 할 수 있는 패턴
 */
public class Main {
    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.add("Hello");
        strings.add("This is a DecoratorPattern.");
        strings.add("It's a pattern where functionalities are added like decorations—layer by layer.");
        strings.add("It's awesome.");

        strings.print();

        Item decorator = new SideDecorator(strings, '\"');
        decorator.print();
        decorator = new LineNumberDecorator(decorator); // 사이드 데코레이터에 라인넘버를 추가.
        decorator.print();
        decorator = new BoxDecorator(decorator); // 사이드 + 라인넘버추가된 곳에 박스 데코레이터를 추가.
        decorator.print();

        Item decorator2 = new BoxDecorator(strings);
        decorator2.print();
        decorator2 = new LineNumberDecorator(decorator2);
        decorator2.print();
    }
}
