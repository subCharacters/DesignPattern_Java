package Singleton;

import Singleton.mode.DarkMode;
import Singleton.page.LoginPage;
import Singleton.page.TopPage;

public class Main {
    public static void main(String[] args) {
        TopPage topPage = new TopPage();
        LoginPage loginPage = new LoginPage();

        // 톱 페이지의 접속
        topPage.connectTopPage();
        // 로그인 페이지의 접속
        loginPage.connectLoginPage();

        // 모드 변경
        DarkMode.getInstance().changeMode();

        // 톱 페이지의 접속
        topPage.connectTopPage();
        // 로그인 페이지의 접속
        loginPage.connectLoginPage();

        // 모드 변경
        DarkMode.getInstance().changeMode();

        // 톱 페이지의 접속
        topPage.connectTopPage();
        // 로그인 페이지의 접속
        loginPage.connectLoginPage();

        /*
         * Top Page의 모드는 light
         * Login Page의 모드는 light
         * Top Page의 모드는 dark
         * Login Page의 모드는 dark
         * Top Page의 모드는 light
         * Login Page의 모드는 light
         */
    }
}
