package hw07;

public class Main {
    public static void main(String[] args) {
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
        child1.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(), "go to the course"}, {DayOfWeek.TUESDAY.name(), "do homework"}});
        Human child3 = new Human();
        child3.setName("Jane");
        child3.setSurname("Karleone");
        child3.setYear(1983);
        child3.setIq(60);
        child3.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(), "freetime"}, {DayOfWeek.FRIDAY.name(), "go to work"}});
        Human child2 = new Human();
        child2.setName("Carol");
        child2.setSurname("Karleone");
        child2.setYear(1979);
        child2.setIq(80);
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
        Family secondfamily = new Family();
        secondfamily.setFather(anotherFather);
        secondfamily.setMother(anotherMother);
        secondfamily.addChild(child1);
        secondfamily.addChild(child2);
        secondfamily.addChild(child3);

        System.out.println(new RoboCat("Jack", 5, 80, new String[]{"sleep"}));


        for (int z = 0; z < 10; z++) {
            new Human();
            System.gc();
        }


    }
}
