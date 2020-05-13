import java.util.HashMap;
import java.util.Map;

public class AnimalRegistory {

    private Map<AnimalType, Animal> animals = new HashMap<>();

    public AnimalRegistory() {
        this.initialize();
    }

    public Animal getAnimal(AnimalType animalType) {

        Animal animal = null;

        try {
            animal = (Animal) animals.get(animalType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return animal;

    }

    private void initialize() {

        Dog dog = new Dog();
        dog.setColor("Brown");
        dog.setAgeMonths(1);
        dog.setBreed("Normal");

        Cat cat = new Cat();
        cat.setColor("White");
        cat.setAgeMonths(1);
        cat.setHairType("Short");

        animals.put(AnimalType.DOG, dog);
        animals.put(AnimalType.CAT, cat);

    }

}
