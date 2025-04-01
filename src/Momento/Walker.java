package Momento;

import java.util.ArrayList;

public class Walker {
    private int currentX, currentY;
    private int targetX, targetY;
    private ArrayList<String> actionList = new ArrayList<>();

    public Walker(int currentX, int currentY, int targetX, int targetY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.targetX = targetX;
        this.targetY = targetY;
    }

    public double walk(String action) {
        actionList.add(action);

        if (action.equals("UP")) {
            currentY++;
        } else if (action.equals("RIGHT")) {
            currentX++;
        } else if (action.equals("DOWN")) {
            currentX--;
        } else if (action.equals("LEFT")) {
            currentX--;
        }

        // 유클리드 2차원 거리 공식
        return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
    }

    public class Momento {
        private int x, y;
        private ArrayList<String> actionList;
        private Momento(){}
    }

    public Momento createMomento() {
        Momento momento = new Momento();

        momento.x = this.currentX;
        momento.y = this.currentY;
        momento.actionList = (ArrayList<String>) this.actionList.clone();

        return momento;
    }

    public void restoreMomento(Momento momento) {
        this.currentX = momento.x;
        this.currentY = momento.y;
        this.actionList = (ArrayList<String>) momento.actionList.clone();
    }

    @Override
    public String toString() {
        return actionList.toString();
    }
}
