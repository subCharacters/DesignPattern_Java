package Template;

public class Main {
    public static void main(String[] args) {
        RamenTemplate charsiuRamen = new CharsiuRamen();
        charsiuRamen.serveRamen();

        RamenTemplate greenOnionRamen = new GreenOnionRamen();
        greenOnionRamen.serveRamen();

        /***
         * 기본 라면을 만들었습니다.
         * 챠슈를 얹었습니다.
         * 라면을 제공했습니다.
         * 기본 라면을 만들었습니다.
         * 파를 얹었습니다.
         * 라면을 제공했습니다.
         */
    }
}
