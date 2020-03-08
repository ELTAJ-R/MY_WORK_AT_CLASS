package hw06;

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
        pet.setSpecies(Species.DOG);
        pet.setHabits(new String[]{"eat", "sleep"});
        Pet anotherPet = new Pet();
        anotherPet.setNickname("Jack");
        anotherPet.setAge(5);
        anotherPet.setSpecies(Species.CAT);
        anotherPet.setTrickLevel(45);
        anotherPet.setHabits(new String[]{"do nothing"});
        Human child1 = new Human();
        child1.setName("Michael");
        child1.setSurname("Karleone");
        child1.setYear(1977);
        child1.setIq(90);
        child1.setPet(pet);
        child1.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(), "go to the course"}, {DayOfWeek.TUESDAY.name(), "do homework"}});
        Human child3 = new Human();
        child3.setName("Jane");
        child3.setSurname("Karleone");
        child3.setYear(1983);
        child3.setIq(60);
        child3.setPet(pet);
        child3.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(), "freetime"}, {DayOfWeek.FRIDAY.name(), "go to work"}});
        Human child2 = new Human();
        child2.setName("Carol");
        child2.setSurname("Karleone");
        child2.setYear(1979);
        child2.setIq(80);
        child2.setPet(anotherPet);
        child2.setSchedule(new String[][]{{DayOfWeek.SATURDAY.name(), "learn English"}, {DayOfWeek.WEDNESDAY.name(), "rest"}});
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
        ;
//        firstfamily.deleteChild(child1);


        Family secondfamily = new Family();
        secondfamily.setFather(anotherFather);
        secondfamily.setMother(anotherMother);
        secondfamily.setPet(anotherPet);
        secondfamily.addChild(child1);
        secondfamily.addChild(child2);
        secondfamily.addChild(child3);
//        secondfamily.deleteChildIndex(1);

//        for(int i=0;i<10;i++){
////            new Human();
////            System.gc();
////        }


//        System.out.println(firstfamily.countFamily());
//        System.out.println(secondfamily.countFamily());
//
//        System.out.println(firstfamily.hashCode());
//        System.out.println(secondfamily.hashCode());
//        System.out.println(firstfamily.equals(secondfamily));
//        System.out.println(mother.equals(anotherMother));
//        System.out.println(pet.equals(anotherPet));
        System.out.println(firstfamily);
        System.out.println(secondfamily);
//        System.out.println(child1.welcomeTheFavourite());
//        System.out.println(child1.describeTheFavourite());
//        child1.feed();
//        child2.feed();


    }
}
