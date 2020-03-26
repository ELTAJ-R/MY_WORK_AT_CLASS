package hw11;

import hw09.DomesticCat;


public class MainDAO {

    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone");

        Human father = new Human("Vito", "Karleone");

        Human anotherMother = new Human("Jane", "Mikelsons");

        Human anotherFather = new Human("Mark", "Mikelsons");

        Human child1 = new Human("Michael", "Karleone", 739997942000L, 90);

        Human child2 = new Human("Carol", "Karleone",954097142000L , 80);

        Human child3 = new Human("Jane", "Karleone",538426742000L, 60);
        DomesticCat ex = new DomesticCat("Tom", 5, 75);
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
        test.adoptChild(second, new Human("Henry","Mikalseon","10/05/1985",87));
        test.addPet(0, ex);
        test.createNewFamily(mother, father);
//        System.out.println(test.getPets(0));
//        System.out.println(test.getFamilyByIndex(0));
        test.deleteChildrenOlderThan(35);

        test.displayAllFamilies();
//        test.getFamiliesBiggerThan(5);
//        test.getFamiliesSmallerThan(6);




    }


}
