package hw09;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FamilyController {
    FamilyService app=new FamilyService();



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
    public void adoptChild(Family family,Human child){
        app.adoptChild(family,child);
    }
    public void deleteChildrenOlderThan(int ageLimit){
       app.deleteChildrenOlderThan(ageLimit);
    }
    public int count(){
        return app.count();
    }
    public Optional<Family> getFamilyByIndex(int index){
       return app.getFamilyByIndex(index);
    }
    public List<Pet> getPets(int familyIndex){
        return app.getPets(familyIndex);

    }
    public void addPet(int index,Pet pet){
        app.addPet(index,pet);
    }
    public void deleteFamilyByIndex(int index){
        app.delete(index);
    }

}
