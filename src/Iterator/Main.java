package Iterator;

public class Main {

    /*
     * Array,LinkedList, Tree 등과 같은 다양한  Container, Aggregator를
     * 개발자가 자료구조의 특성을 다 파악하지 않아도 하나의 공통된 api로 참조 할 수 있게 된다.
     */
    public static void main(String[] args) {
        Item[] items = {
                new Item("CPU", 1000),
                new Item("RAM", 2000),
                new Item("HDD", 3000),
                new Item("SSD", 4000)
        };

        Array array = new Array(items);
        Iterator iterator = array.iterator();

        while (iterator.next()) {
            Item item = (Item) iterator.current();
            System.out.println(item);
        }
    }
}
