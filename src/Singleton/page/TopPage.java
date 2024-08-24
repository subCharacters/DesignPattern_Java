package Singleton.page;

import Singleton.mode.DarkMode;

public class TopPage {
    public void connectTopPage() {
        System.out.println("Top Page의 모드는 " + DarkMode.getInstance().getMode());
    }
}
