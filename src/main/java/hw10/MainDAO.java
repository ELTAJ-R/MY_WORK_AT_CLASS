package hw10;

import hw09.Human;

public class MainDAO {

    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone");

        Human father = new Human("Vito", "Karleone");

        Human anotherMother = new Human("Jane", "Mikelsons");

        Human anotherFather = new Human("Mark", "Mikelsons");

        Human child1 = new Human("Michael", "Karleone", 20, 90);

        Human child2 = new Human("Carol", "Karleone", 15, 80);

        Human child3 = new Human("Jane", "Karleone", 25, 60);


        DomesticCat ex = new DomesticCat("Tom", 5, 75);

        Dog dog = new Dog("Jack", 10, 65);
        FamilyController test = new FamilyController();

        Family first = new Family();
        first.setFather(father);
        first.setMother(mother);
        test.saveFamily(first);
        test.adoptChild(first, child1);
        Family second = new Family();
        second.setMother(anotherMother);
        second.setFather(anotherFather);
        second.addChild(child2);
        test.saveFamily(second);
        test.bornChild(second, "Tom", "Jane");
        test.adoptChild(second, child3);
        test.addPet(0, ex);
        test.createNewFamily(mother, father);
        System.out.println(test.getPets(0));

        test.displayAllFamilies();
        System.out.println(test.getFamilyByIndex(0));
        test.deleteChildrenOlderThan(18);

        test.displayAllFamilies();
        test.getFamiliesBiggerThan(3);
        test.getFamiliesSmallerThan(4);


    }


}
