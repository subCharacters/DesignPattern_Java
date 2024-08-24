package Singleton.mode;

public class DarkMode {
    private static DarkMode instance = null;

    private String mode;

    private DarkMode() {}

    public static DarkMode getInstance() {
        if (instance == null) {
            instance = new DarkMode();
            // 기본 값
            instance.mode = "light";
        }
        return instance;
    }

    public void changeMode() {
        if (mode.equals("light")) {
            mode = "dark";
        } else if (mode.equals("dark")) {
            mode = "light";
        }
    }

    public String getMode() {
        return mode;
    }
}
