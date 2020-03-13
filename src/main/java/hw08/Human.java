package hw08;

import java.util.HashMap;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    Pet pet;

    HashMap<DayOfWeek, String> schedule = new HashMap<>();

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human() {

    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public HashMap<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(DayOfWeek day, String work) {
        schedule.put(day, work);
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


    public String show() {
        return String.format("%s %s", getName(), getSurname());


    }

    public String greetPet() {
        return String.format("Hello,%s", pet.getNickname());
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
        return String.format("Name: %s,Surname: %s,Age: %d,IQ:%d,Schedule:%s "
                , getName(), getSurname(), getYear(), getIq(), schedule);
    }

    @Override
    protected void finalize() {
        System.out.println("Human object deleted");
    }
}











