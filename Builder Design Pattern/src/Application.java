public class Application {

    public static void main(String[] args) {

        User.Builder builder = new User.Builder("Nimal", "Rathnayake");
        User user = builder.setAge(34)
                .setGender("Male")
                .build();

        System.out.println(user);

        User user2 = new User.Builder("Kusal", "Shanuka")
                .setGender("Male")
                .setCity("Negombo")
                .setAge(24)
                .build();

        System.out.println(user2);

    }

}
