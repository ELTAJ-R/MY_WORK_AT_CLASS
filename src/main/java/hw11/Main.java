package hw11;

import hw09.DomesticCat;


public class Main {
    public static void main(String[] args) {
       hw11.Human mother = new hw11.Human("Jane", "Karleone");

        hw11.Human father = new hw11.Human("Vito", "Karleone");

        hw11.Human anotherMother = new hw11.Human("Jane", "Mikelsons");

        hw11.Human anotherFather = new hw11.Human("Mark", "Mikelsons");

        hw11.Human child1 = new hw11.Human("Michael", "Karleone", 739997942000L, 90);

        hw11.Human child2 = new hw11.Human("Carol", "Karleone",954097142000L , 80);

        hw11.Human child3 = new Human("Jane", "Karleone",538426742000L, 60);
        hw09.DomesticCat ex = new DomesticCat("Tom", 5, 75);

        //        for (int z = 0; z < 10; z++) {
//            new Human();
//            System.gc();
//        }


    }
}
