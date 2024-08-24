package Builder02;

public class Director {
    private UserBuilder userBuilder;

    public Director(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        if (userBuilder instanceof PlainTextBuilder) {
            sb.append("[Info Log] ");
            sb.append(userBuilder.createText());
            sb.append(" <-- User Info");
        } else if (userBuilder instanceof JSONBuilder) {
            sb.append("Headers: {")
                    .append("\"Content-Type\": \"application/json\", ")
                    .append("\"Accept\": \"application/json\", ")
                    .append("\"Authorization\": \"Bearer your_access_token\"")
                    .append("}\n");
            sb.append("Body: {");
            sb.append(userBuilder.createText());
            sb.append(" }");
        }
        return sb.toString();
    }
}
