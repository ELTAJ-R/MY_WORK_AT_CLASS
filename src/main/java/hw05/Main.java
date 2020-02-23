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
        Human child1 = new Human()
        {
            @Override
            public String toString() {
                return String.format("Name: " + getName() + " Surname: " + getSurname() + " Age: " + getYear() + " IQ: " +getIq());
            }

        };
        child1.setName("Michael");
        child1.setSurname("Karleone");
        child1.setYear(1977);
        child1.setIq(90);
        child1.setPet(pet);

        Human child2=new Human();
        child2.setName("Carol");
        child2.setSurname("Karleone");
        child2.setYear(1979);
        child2.setIq(80);
        child2.setPet(pet);
        Human mother2=new Human();
        Human father2=new Human();

         Family extra=new Family();


         Family family2=new Family();
         family2.addChild(child2);
         family2.addParents(mother);
         family2.addParents(father);






        System.out.println(pet.respond());
        System.out.println(pet.eat());
        System.out.println(pet.foul());
        System.out.println(child1);
        System.out.println(pet.showanimal());
        child1.feed();
        System.out.println(child1.describeTheFavourite());


        family2.print();

    }

}