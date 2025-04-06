package ChainOfResponsibility;

public class PortHandler extends Handler {
    @Override
    protected void process(String url) {
        int index = url.lastIndexOf(":");
        if (index != -1) {
            String strPort = url.substring(index + 1);
            int port = Integer.parseInt(strPort);
            System.out.println("PORT: " + port);
            return;
        }

        System.out.println("NO PORT");
    }
}
