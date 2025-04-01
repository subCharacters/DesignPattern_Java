package Momento;

import java.util.Random;

/**
 * 객체의 상태를 기억해 두었다가 필요 할 때 기억해둔 상태로 객체를 되돌린다.
 * 객체는 다른 객체에서 읽을 수 있지만 읽기 전용이어야 한다.
 * 객체의 상태에 대한 기억에 대한 생성은 오직 해당 객체만 할 수 있다.
 */
public class Main {
    public static void main(String[] args) {
        Walker walker = new Walker(0, 0, 10, 10);
        String[] actions = {"UP", "DOWN", "LEFT", "RIGHT"};
        Random rand = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Momento momento = null;

        while (true) {
            String action = actions[rand.nextInt(4)];
            double distance = walker.walk(action);
            System.out.println(action + " " + distance);

            if (distance == 0.0) {
                break;
            }

            if (minDistance > distance) {
                minDistance = distance;
                momento = walker.createMomento();
            } else {
                if (momento != null) {
                    walker.restoreMomento(momento);
                }
            }
        }

        System.out.println("Walker's path: " + walker);
    }
}
