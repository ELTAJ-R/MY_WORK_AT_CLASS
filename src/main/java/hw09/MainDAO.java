package hw09;

public class MainDAO {
    public static void main(String[] args) {
        FamilyController app = new FamilyController();
        Human mother = new Human();
        mother.setName("Jane");
        mother.setSurname("Karleone");
        Human father = new Human();
        father.setName("Vito");
        father.setSurname("Karleone");
        Human child1 = new Human();
        child1.setName("Michael");
        child1.setSurname("Karleone");
        child1.setYear(1977);
        child1.setIq(90);
        Human child3 = new Human();
        child3.setName("Jane");
        child3.setSurname("Karleone");
        child3.setYear(1983);
        child3.setIq(60);
        Human child2 = new Human();
        child2.setName("Carol");
        child2.setSurname("Karleone");
        child2.setYear(1979);
        child2.setIq(80);
        child2.setSchedule(DayOfWeek.MONDAY, "rest");
        child2.setSchedule(DayOfWeek.TUESDAY, "do homework");
        Human anotherMother = new Human();
        anotherMother.setName("Jane");
        anotherMother.setSurname("Mikelsons");
        Human anotherFather = new Human();
        anotherFather.setName("Mark");
        anotherFather.setSurname("Mikelsons");

        DomesticCat ex = new DomesticCat("Tom", 5, 75);
        ex.setHabits("sleep");
        ex.setHabits("eat");
        Dog dog = new Dog("Jack", 10, 65);

        Family new_Family = app.createNewFamily(mother, father);
        Family another_Family = app.createNewFamily(anotherMother, anotherFather);
        app.saveFamily(another_Family);
        app.saveFamily(new_Family);
        app.adoptChild(another_Family, child1);
        System.out.println(app.countFamiliesWithMemberNumber(2));

    }


}
