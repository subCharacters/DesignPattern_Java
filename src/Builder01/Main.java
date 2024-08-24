package Builder01;

public class Main {
    public static void main(String[] args) {
        // 기존 생성자 방식
        User user1 = new User("User1", 20, "Male", "Seoul");
        System.out.println(user1.toString());

        // 빌더 패턴 사용
        // 생성자 방식과 달리 순서를 기억하지 않아도 된다.
        User user2 = new UserBuilder()
                .setName("User2")
                .setAge(30)
                .setGender("Female")
                .setAddress("Busan")
                .build();
        System.out.println(user2.toString());

        // 이런식으로 일부만 생성도 가능.
        User user3 = new UserBuilder()
                .setName("User3")
                .setAge(30)
                .setGender("Female")
                .build();
        System.out.println(user3.toString());

        /**
         * User [name=User1, age=20, gender=Male, address=Seoul]
         * User [name=User2, age=30, gender=Female, address=Busan]
         * User [name=User3, age=30, gender=Female, address=null]
         */
    }
}
