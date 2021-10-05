package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        // animalCrying() 메소드에 static이 없는 경우
//        AnimalTest2 at2 = new AnimalTest2();
//
//        at2.animalCrying(bigCat);
//        at2.animalCrying(cat);
//        at2.animalCrying(dog);
//        at2.animalCrying(cow);


        animalCrying(bigCat);
        animalCrying(cat);
        animalCrying(dog);
        animalCrying(cow);
    }

//    public static void animalCrying(Animal animal) {
//        animal.crying();
//    }

    public static void animalCrying(Animal animal) {
        Animal animal1 = new Animal();
    }

}
