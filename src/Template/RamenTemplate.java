package Template;

public abstract class RamenTemplate {

    // 외부에서 변경하지 못하도록 final선언.
    final void serveRamen() {
        cookBaseRamen();
        putUpTopping();
        serve();
    }

    void cookBaseRamen() {
        System.out.println("기본 라면을 만들었습니다.");
    }

    protected abstract void putUpTopping();

    void serve() {
        System.out.println("라면을 제공했습니다.");
    }
}
