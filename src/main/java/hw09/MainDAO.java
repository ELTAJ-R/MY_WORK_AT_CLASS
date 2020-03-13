package hw09;

public class MainDAO {
    public static void main(String[] args) {
        FamilyController app=new FamilyController();
        Human mother=new Human("First","First");
        Human father=new Human("First","First");

        Human ch=new Human();

        Human mother1=new Human("Second","Second");
        Human father1=new Human("Second","Second");

        Family first=app.createNewFamily(mother,father);
        Family second=app.createNewFamily(mother1,father1);



        ch.setName("Second try");
        ch.setYear(19);
        Human example=new Human();
        example.setYear(18);
        second.addChild(example);



        app.saveFamily(first);
        app.saveFamily(second);
//        app.displayAllFamilies();
        app.bornChild(first,"Tom","Jane");
        app.adoptChild(second,ch);
        app.deleteChildrenOlderThan(5);
        app.displayAllFamilies();
        System.out.println(app.count());
        System.out.println(app.getFamilyByIndex(1));
        System.out.println(app.getPets(0));
    }


}
