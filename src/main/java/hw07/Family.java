package hw07;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Pet pet;
    Human[] children = new Human[0];

    public Family() {
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Human[] addChild(Human ch) {
        Human[] process = Arrays.copyOf(children, children.length + 1);
        process[children.length] = ch;
        return this.children = process;
    }

    public boolean deleteChild(Human child) {
        Human[] deleted = new Human[children.length - 1];


        for (int i = 0; i < children.length; i++) {

            if (child.equals(children[i])) {
                System.arraycopy(children, 0, deleted, 0, i);
                System.arraycopy(children, i + 1, deleted, i, deleted.length - i);
                this.children = deleted;
                return true;


            }


        }
        return false;
    }


    public boolean deleteChildIndex(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }
        Human[] children_new = new Human[children.length - 1];

        System.arraycopy(children, 0, children_new, 0, index);
        System.arraycopy(children, index + 1, children_new, index, children_new.length - index);


        this.children = children_new;
        return true;
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


    public String describeTheFavourite() {
        return
                String.format("I have a %s,he is %d years old,he is %s ", Species.UNKNOWN,
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
        return test.getMother() == getMother();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (Objects.hashCode(this.getFather()) + Objects.hashCode(this.getMother()) +
                Objects.hashCode(this.countFamily()));
        return hash;
    }

    @Override
    protected void finalize() {
        System.out.println("Family object deleted");
    }
}