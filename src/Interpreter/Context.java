package Interpreter;

public class Context {
    public void move(int steps) {
        System.out.println(steps + "칸 앞으로 이동");
    }

    public void turn(String direction) {
        System.out.println(direction.equals("LEFT") ? "왼쪽으로 회전" : "오른쪽으로 회전");
    }

    public void attack() {
        System.out.println("공격 실행");
    }
}
