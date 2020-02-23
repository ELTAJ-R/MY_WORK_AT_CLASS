package hw05;

import java.util.ArrayList;
import java.util.Objects;

public class Family extends Human {

    ArrayList<Human> Children = new ArrayList<>();


    public Family() {

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
    private Human[] children;
    private Pet pet;

    @Override
    public String toString() {
        return "Family{" +
                "Children=" + Children +
                ", Mother=" + Mother.show() +
                ", Father=" + Father.show() +
                ", pet=" + pet.showanimal() +
                '}';
    }

    public void addChild(Human child) {
        Children.add(child);

    }

    public void addParents(Human Parent) {
        Children.add(Parent);
    }

    public boolean deleteChild(int index) {
        Children.remove(index);
        return true;

    }

    StringBuilder useful = new StringBuilder();

    public void print() {
        for (Human el : Children) {
            System.out.println(el.show());
        }

    }

    public int countFamily() {
        return Children.size();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Family test = (Family) object;
      //  if (test.countFamily() != countFamily()) return false;
        if (test.getFather() != getFather()) return false;
        if (test.getMother() !=getMother()) return false;
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.countFamily());
        return hash;
    }


}