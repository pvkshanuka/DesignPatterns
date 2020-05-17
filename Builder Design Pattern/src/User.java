public class User {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String city;
    private final String gender;

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.city = builder.city;
        this.gender = builder.gender;
    }


    static class Builder{

        private String firstName;
        private String lastName;
        private Integer age;
        private String city;
        private String gender;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public User build(){
            return new User(this);
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
