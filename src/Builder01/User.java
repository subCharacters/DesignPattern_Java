package Builder01;

public class User {
    private String name;
    private int age;
    private String gender;
    private String address;

    public User(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
    }
}
