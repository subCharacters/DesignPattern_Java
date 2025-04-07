package Facade;

public class Player {
    private String name;
    private int level;
    private String position;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
        this.level = 1;
    }

    public String getPosition() {
        return position;
    }

    public void levelUp() {
        level++;
        System.out.println(name + " leveled up to " + level + "!");
    }
}
