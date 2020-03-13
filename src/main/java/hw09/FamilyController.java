package hw09;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FamilyController {
    FamilyService app=new FamilyService();
    public Optional<Family> get(int index) {
        return Optional.empty();
    }


    public Collection<Family> getAll() {
        return app.getAll();
    }


    public Family createNewFamily(Human mother,Human father) {
       return app.create(mother,father);

    }


    public boolean saveFamily(Family obj) {
       return app.saveFamily(obj);
    }


    public boolean delete(Family obj) {
      return app.delete(obj);
    }


    public boolean delete(int index) {
       return app.delete(index);
    }
    public void displayAllFamilies(){
        app.displayAllFamilies();
    }
    public void getFamiliesBiggerThan(int sizeOfFamily){
      app.getFamiliesBiggerThan(sizeOfFamily);
    }
    public void getFamiliesSmallerThan(int sizeOfFamily){
       app.getFamiliesSmallerThan(sizeOfFamily);
    }

    public void bornChild(Family before,String Tom,String Jane){
        app.bornChild(before,Tom, Jane);

    }



}
