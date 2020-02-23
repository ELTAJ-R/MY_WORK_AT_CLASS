package hw05;

import java.util.Objects;

public class Human {
    private String name;
    private Pet pet;
    private Family family;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    private String surname;
    private int year;
    private int iq;

    private String schedule[][] = new String[7][2];

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human() {

    }


    public String welcomeTheFavourite() {
        return
                String.format("Hello," + pet.getNickname());
    }

    public String describeTheFavourite() {
        return
                String.format("I have a " + pet.getSpecies() + " he is " + pet.getAge() + " years old " + "he is " +
                        pet.assessTrick());

    }

    public String show() {
        return String.format(getName() + " " + getSurname());


    }

    public void feed() {
        int a = (int) (Math.random() * 100 + 1);
        if (pet.getTrickLevel() > 50) {
            System.out.println("Hm... I will feed Jack's " + pet.getNickname());


        } else {
            System.out.println("I think Jack is not hungry.");


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
        Human test = (Human) object;
        if (test.getName() != getName()) return false;
        if (test.getSurname() != getSurname()) return false;
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.getName());
        return hash;
    }
}








