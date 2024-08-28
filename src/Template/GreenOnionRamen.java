package Template;

public class GreenOnionRamen extends RamenTemplate {
    @Override
    protected void putUpTopping() {
        System.out.println("파를 얹었습니다.");
    }
}
