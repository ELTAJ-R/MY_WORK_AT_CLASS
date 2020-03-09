package hw05;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Pet pet;

    public Family() {

    }


    Human[] children = new Human[0];

    public Human[] addChild(Human ch) {

        Human[] process = Arrays.copyOf(children, children.length + 1);
        process[children.length] = ch;
        return this.children = process;
    }

    public Human[] deleteChild(Human child) {
        Human[] deleted = new Human[children.length - 1];
        for (int i = 0; i < children.length; i++) {
            if (!child.equals(children[i])) {
                for (int a = 0; a < deleted.length; a++) {
                    deleted[a] = children[i];

                }
            }
        }

        return this.children = deleted;

    }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother1) {
        mother = mother1;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father1) {
        father = father1;
    }


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String welcomeTheFavourite() {
        return
                String.format("Hello,%s", pet.getNickname());
    }

    public String describeTheFavourite() {
        return
                String.format("I have a %s,he is %d years old,he is %s ", pet.getSpecies(),
                        pet.getAge(), pet.assessTrick());

    }

    public void feed() {
        if (pet.getTrickLevel() > 50) {
            System.out.println("Hm... I will feed  " + pet.getNickname());


        } else {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");


        }
    }


    @Override
    public String toString() {
        return "Family{" +
                "Children=" + Arrays.toString(children) +
                ", Mother=" + mother.show() +
                ", Father=" + father.show() +
                ", pet=" + pet +
                '}';
    }


    public int countFamily() {
        return children.length + 2;
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