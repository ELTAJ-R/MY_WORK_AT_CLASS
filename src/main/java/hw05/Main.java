package hw05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human();
        mother.setName("Jane");
        mother.setSurname("Karleone");
        Human father = new Human();
        father.setName("Vito");
        father.setSurname("Karleone");
        Pet pet = new Pet();
        pet.setNickname("Rock");
        pet.setAge(5);
        pet.setTrickLevel(75);
        pet.setSpecies("Dog");
        Pet anotherPet = new Pet();
        anotherPet.setNickname("Jack");
        anotherPet.setAge(5);
        anotherPet.setSpecies("Cat");
        anotherPet.setTrickLevel(45);
        Human child1 = new Human() {
            @Override
            public String toString() {
                return String.format("Name: " + getName() + " Surname: " + getSurname() + " Age: " + getYear() + " IQ: " + getIq());
            }

        };
        child1.setName("Michael");
        child1.setSurname("Karleone");
        child1.setYear(1977);
        child1.setIq(90);
        child1.setPet(pet);


        Human child2 = new Human() {
            @Override
            public String toString() {
                return String.format("Name: " + getName() + " Surname: " + getSurname() + " Age: " + getYear() + " IQ: " + getIq());
            }
        };

        child2.setName("Carol");
        child2.setSurname("Karleone");
        child2.setYear(1979);
        child2.setIq(80);
        child2.setPet(anotherPet);
        Human anotherMother = new Human();
        anotherMother.setName("Jane");
        anotherMother.setSurname("Mikelsons");
        Human anotherFather = new Human();
        anotherFather.setName("Mark");
        anotherFather.setSurname("Mikelsons");

        Family firstfamily = new Family();
        firstfamily.setMother(mother);
        firstfamily.setFather(father);
        firstfamily.setPet(pet);
        firstfamily.addChild(child1);
        firstfamily.deleteChild(child1);
        firstfamily.countFamily();

        Family secondfamily = new Family();
        secondfamily.setFather(anotherFather);
        secondfamily.setMother(anotherMother);
        secondfamily.setPet(anotherPet);
        secondfamily.addChild(child2);
        secondfamily.addChild(child1);
        secondfamily.countFamily();

        System.out.println(firstfamily.hashCode());
        System.out.println(secondfamily.hashCode());
        System.out.println(firstfamily.equals(secondfamily));
        System.out.println(mother.equals(anotherMother));
        System.out.println(pet.equals(anotherPet));
        System.out.println(firstfamily);
        System.out.println(secondfamily);
        System.out.println(child1.welcomeTheFavourite());
        System.out.println(child1.describeTheFavourite());
        child1.feed();
        child2.feed();


    }

}