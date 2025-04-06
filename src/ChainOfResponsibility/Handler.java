package ChainOfResponsibility;

public abstract class Handler {
    protected Handler nextHandler;

    // 다음 책임을 지정하는 메서드
    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    // 구체적인 프로세스. 자식에서만 접근 가능하도록 protected
    protected abstract void process(String url);

    public void run(String url) {
        process(url);
        if (nextHandler != null) {
            nextHandler.run(url);
        }
    }
}
