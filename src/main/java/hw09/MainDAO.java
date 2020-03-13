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
        Human anotherMother = new Human();
        anotherMother.setName("Jane");
        anotherMother.setSurname("Mikelsons");
        Human anotherFather = new Human();
        anotherFather.setName("Mark");
        anotherFather.setSurname("Mikelsons");

        DomesticCat ex = new DomesticCat("Tom", 5, 75);
        ex.setHabits("sleep");
        ex.setHabits("eat");

        Family new_Family = app.createNewFamily(mother, father);
        Family another_Family = app.createNewFamily(anotherMother, anotherFather);
        app.saveFamily(another_Family);
        app.saveFamily(new_Family);
        app.adoptChild(another_Family, child1);
        System.out.println(app.countFamiliesWithMemberNumber(2));

    }


}
