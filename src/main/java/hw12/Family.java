package hw12;


import hw09.Pet;
import hw09.Species;

import java.time.Period;
import java.util.*;


public class Family {
    private Human mother;
    private Human father;
    Pet pet;
    List<Human> children = new ArrayList<>();
    HashSet<Pet> pets = new HashSet<>();


    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }


    public boolean addChild(Human ch) {
        if (!children.contains(ch)) {
            children.add(ch);
            return true;
        }
        return false;

    }

    public boolean deleteChild(Human child) {
        if (children.contains(child)) {
            children.remove(child);
            return true;
        }
        return false;
    }


    public boolean deleteChildIndex(int index) {

        if (index >= 0 && index < children.size()) {
            children.remove(index);
            return true;
        }
        return false;
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
        for (Pet pet : pets) {
            this.pet = pet;
        }
        return pet;
    }


    public void setPet(Pet pet) {
        pets.add(pet);
    }

    @Override
    public String toString() {
        return "Family{" +
                "Children=" + children +
                ", Mother=" + mother.show() +
                ", Father=" + father.show() +
                ", pet=" + pets +
                '}';
    }

    public String prettyFormat() {
        return String.format("Family:\n children:%s\n mother:%s\n father:%s\n pets:%s\n"
                , listToString(children), mother.show(), father.show(), SetToString(pets));
    }

    public static String listToString(List list) {
        StringJoiner result = new StringJoiner("\n    child:", "\n    child:", "");
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i).toString());
        }
        return result.toString();
    }

    public static String SetToString(HashSet<Pet> set) {
        StringJoiner result = new StringJoiner("\n    pet:", "\n    pet:", "");
        for (Pet el : set) {
            result.add(el.toString());
        }
        return result.toString();
    }


    public int countFamily() {
        return children.size() + 2;
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