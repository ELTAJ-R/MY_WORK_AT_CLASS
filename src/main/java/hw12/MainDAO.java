package hw12;

import hw09.DomesticCat;
import hw09.Fish;

public class MainDAO {

    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone");

        Human father = new Human("Vito", "Karleone");

        Human anotherMother = new Human("Jane", "Mikelsons");

        Human anotherFather = new Human("Mark", "Mikelsons");

        Human child1 = new Human("Michael", "Karleone", 20, 90);

        Human child2 = new Human("Carol", "Karleone", 15, 80);

        Human child3 = new Human("Jane", "Karleone", 25, 60);
        DomesticCat firstOne = new DomesticCat("Tom", 5, 75);
        Fish secondOne = new Fish("Fish", 1, 80);
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
        test.addPet(0, firstOne);
        test.addPet(0, secondOne);
        test.createNewFamily(mother, father);

        System.out.println(test.getPets(0));
        System.out.println(test.getFamilyByIndex(0));
        test.deleteChildrenOlderThan(18);

        test.displayAllFamilies();
        test.getFamiliesBiggerThan(5);
        test.getFamiliesSmallerThan(6);

        System.out.println(test.count());
        ;


    }


}
