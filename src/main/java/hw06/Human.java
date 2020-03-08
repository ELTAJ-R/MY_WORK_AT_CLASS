package hw06;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private Pet pet;
    private Family family;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;


    StringBuilder sch = new StringBuilder();


    public StringBuilder getSchedule() {
        for (int i = 0; i < schedule.length; i++) {
            for (int a = 0; a < schedule.length; a++) {
            }
            sch.append(Arrays.toString(schedule[i]));
        }
        return sch;
    }

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
                String.format("Hello,%s", pet.getNickname());
    }

    public String describeTheFavourite() {
        return
                String.format("I have a %s,he is %d years old,he is %s ", pet.getSpecies(),
                        pet.getAge(), pet.assessTrick());

    }

    public String show() {
        return String.format(getName() + " " + getSurname());


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
        Human test = (Human) object;
        if (test.getName() != getName()) return false;
        if (test.getSurname() != getSurname()) return false;
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.getName())
                + Objects.hashCode(this.getSurname()) + Objects.hashCode(this.getIq());
        return hash;
    }

    @Override
    public String toString() {
        return String.format("Name: %s,Surname: %s,Age: %d,IQ:%d,Schedule:%s ", getName(), getSurname(), getYear(), getIq(), getSchedule());
    }
    @Override
    protected void finalize()
    {
        System.out.println("Human object deleted");
    }
}











