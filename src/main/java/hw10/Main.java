package hw10;

import hw09.DomesticCat;
import hw11.Human;


public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone");

        Human father = new Human("Vito", "Karleone");

        Human anotherMother = new Human("Jane", "Mikelsons");

        Human anotherFather = new Human("Mark", "Mikelsons");

        Human child1 = new Human("Michael", "Karleone", 739997942000L, 90);

        Human child2 = new Human("Carol", "Karleone", 954097142000L, 80);

        Human child3 = new Human("Jane", "Karleone", 538426742000L, 60);
        hw09.DomesticCat ex = new DomesticCat("Tom", 5, 75);

        //        for (int z = 0; z < 10; z++) {
//            new Human();
//            System.gc();
//        }


    }
}
