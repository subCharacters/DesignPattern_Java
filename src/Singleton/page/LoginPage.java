package Singleton.page;

import Singleton.mode.DarkMode;

public class LoginPage {
    public void connectLoginPage() {
        System.out.println("Login Page의 모드는 " + DarkMode.getInstance().getMode());
    }
}
