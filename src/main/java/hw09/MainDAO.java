package hw09;

public class MainDAO {
    public static void main(String[] args) {
        FamilyController app=new FamilyController();
        Human mother=new Human();
        Human father=new Human();

        app.saveFamily(app.createNewFamily(mother,father));
        app.displayAllFamilies();
    }


}
