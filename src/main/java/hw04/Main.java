package hw04;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone", 1950);
        Human father = new Human("Vito", "Karleone", 1950);
        Pet pet = new Pet("Rock", 5, 75, "Dog");
        Human child1 = new Human("Michael", "Karleone", 1977, 90, mother, father, pet) {
            @Override
            public String toString() {
                return String.format("Name: " + name + " Surname: " + surname + " Age: " + year + " IQ: " + iq + " Mother:  " +
                        mother.show() + " Father:  " + father.show() + " About pet:" + pet.showanimal());
            }
        };
        Human child2 = new Human("Carol", "Karleone", 1980, mother, father) {
            @Override
            public String toString() {
                return String.format("Name: " + name + " Surname: " + surname + " Age: " + year + " Mother:  " +
                        mother.show() + " Father:  " + father.show());
            }
        };


        System.out.println(child1.greetPet());
        System.out.println(pet.respond());
        System.out.println(child1.describePet());
        System.out.println(pet.eat());
        System.out.println(pet.foul());
        System.out.println(child1);
        System.out.println(pet.showanimal());
        System.out.println(child2);
        child1.feedpet();
    }

}