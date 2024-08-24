package Builder02;

public class PlainTextBuilder extends UserBuilder {

    public PlainTextBuilder(User user) {
        super(user);
    }

    @Override
    public String createText() {
        StringBuilder text = new StringBuilder();
        text.append("Name : ");
        text.append(user.getName());
        text.append(" ");
        text.append("Age : ");
        text.append(user.getAge());
        text.append(" ");
        text.append("Gender : ");
        text.append(user.getGender());
        text.append(" ");
        text.append("Address : ");
        text.append(user.getAddress());
        return text.toString();
    }
}
