public class Application {

    public static void main(String[] args) {

        AnimalRegistory animalRegistory = new AnimalRegistory();

        Dog dog = (Dog) animalRegistory.getAnimal(AnimalType.DOG);
        System.out.println(dog);

        dog.setBreed("Golden Retriever");
        System.out.println(dog);

        Dog dog2 = (Dog) animalRegistory.getAnimal(AnimalType.DOG);
        System.out.println(dog2);



        Cat cat = (Cat) animalRegistory.getAnimal(AnimalType.CAT);
        System.out.println(cat);

        cat.setHairType("Long");
        System.out.println(cat);

        Cat cat2 = (Cat) animalRegistory.getAnimal(AnimalType.CAT);
        System.out.println(cat2);

    }

}
