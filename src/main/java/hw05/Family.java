package hw05;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human Mother;
    private Human Father;
    private Pet pet;


    Human Children[] = new Human[0];

    public Human[] addChild(Human ch) {

        Human[] process = Arrays.copyOf(Children, Children.length + 1);
        process[Children.length] = ch;
        return this.Children = process;
    }

    public Human[] deleteChild(Human child) {
        Human[] deleted = new Human[Children.length - 1];
        for (int i = 0; i < Children.length; i++) {
            if (child != Children[i]) {
                for (int a = 0; a < deleted.length; a++) {
                    deleted[a] = Children[i];

                }
            }
        }

        return this.Children = deleted;

    }


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

    public void print() {
        for (Human el : Children) {
            System.out.println(el.show());
        }
    }


    @Override
    public String toString() {
        return "Family{" +
                "Children=" + Arrays.toString(Children) +
                ", Mother=" + Mother.show() +
                ", Father=" + Father.show() +
                ", pet=" + pet +
                '}';
    }

    int count = 0;

    public int countFamily() {
        for (Human ch : Children) {
            count++;
        }
        return count + 2;

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
        if (test.countFamily() != countFamily()) return false;
        if (test.getFather() != getFather()) return false;
        if (test.getMother() != getMother()) return false;
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (Objects.hashCode(this.getFather()) + Objects.hashCode(this.getMother()) +
                Objects.hashCode(this.countFamily()));
        return hash;
    }
}