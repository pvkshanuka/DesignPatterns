public class Cat extends Animal {

    String hairType;

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hairType='" + hairType + '\'' +
                '}';
    }
}
