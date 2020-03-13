package hw09;

import org.junit.jupiter.api.Test;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MainDAOTest {

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


    @Test
    void count() {
        test.createNewFamily(mother, father);
        test.createNewFamily(anotherMother, anotherFather);
        int actual = test.count();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void checkCountAndBorn() {

        Family nw_Fam = new Family();
        nw_Fam.setMother(mother);
        nw_Fam.setFather(father);
        test.createNewFamily(anotherMother, anotherFather);
        test.saveFamily(nw_Fam);
        test.bornChild(nw_Fam, "Tom", "Clare");
        test.adoptChild(nw_Fam, child1);
        int actual = test.countFamiliesWithMemberNumber(4);
        int expected = 1;
        assertEquals(expected, actual);


    }


}


