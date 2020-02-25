package hw04;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone", 1950);
        Human father = new Human("Vito", "Karleone", 1950);
        Pet pet = new Pet("Rock", 5, 75, "Dog", new String[]{"eat", "drink", "sleep"});
        Pet different = new Pet("Jack", 10, 100, "Cat", new String[]{"do nothing"});
        Human child1 = new Human("Michael", "Karleone", 1977, 90, mother, father, pet);
        Human child2 = new Human("Carol", "Karleone", 1980, 80, mother, father, different);


        System.out.println(child1.greetPet());
        System.out.println(pet.respond());
        System.out.println(child1.describePet());
        System.out.println(pet.eat());
        System.out.println(pet.foul());
        System.out.println(child1);
        System.out.println(different);
        System.out.println(child2);
        child1.feedpet();

    }

}