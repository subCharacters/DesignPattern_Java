package Builder02;

public class Main {
    public static void main(String[] args) {
        User user = new User("User", 20, "Male", "Hawaii");
        PlainTextBuilder plainTextBuilder = new PlainTextBuilder(user);
        Director director = new Director(plainTextBuilder);
        System.out.println(director.build());

        JSONBuilder jsonBuilder = new JSONBuilder(user);
        director = new Director(jsonBuilder);
        System.out.println(director.build());

        /**
         * [Info Log] Name : User Age : 20 Gender : Male Address : Hawaii <-- User Info
         *
         * Headers: {"Content-Type": "application/json", "Accept": "application/json", "Authorization": "Bearer your_access_token"}
         * Body: {"Name":"User","Age":"20","Gender":"Male","Address":"Hawaii" }
         */
    }
}
