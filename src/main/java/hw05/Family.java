package hw05;

import java.util.ArrayList;

public class Family {

    ArrayList<Human>WholeFamily=new ArrayList<>();



    public Family(){

    }
    public Human getMother() {
        return Mother;
    }

    public void setMother(Human mother) {
        Mother = mother;
    }

    public Human getFather() {
        return Father;
    }

    public void setFather(Human father) {
        Father = father;
    }





    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private Human Mother;
    private Human Father;
    private  Human [] children;
    private Pet pet;

    @Override public String toString(){
        return  String.format("Father"+getFather(),"Mother"+getMother()+"Pet"+getPet());
    }



 public void addChild(Human child){
        WholeFamily.add(child) ;

 }
 public void addParents(Human Parent){
        WholeFamily.add(Parent);
 }
 public boolean deleteChild(int index){
     WholeFamily.remove(index);
     return true;

 }
 public void print() {
     for (Human el : WholeFamily)
     {
         System.out.println(el.show());
     }

 }

 public int countFamily(){
     return

             WholeFamily.size();
 }


}
