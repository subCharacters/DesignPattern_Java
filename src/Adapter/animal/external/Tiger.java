package Adapter.animal.external;

// 외부 클래스라 변경 못한다는 설정.
public class Tiger {
    // Cat, Dog와 다르게 생성자가 아닌 set 메소드를 통해서 설정
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // sound와 비슷한 용도의 메소드
    public void roar() {
        System.out.println("Growl");
    }
}
