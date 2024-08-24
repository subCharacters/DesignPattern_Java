package Builder02;

public abstract class UserBuilder {
    protected User user;

    public UserBuilder(User user) {
        this.user = user;
    }

    public abstract String createText();
}
