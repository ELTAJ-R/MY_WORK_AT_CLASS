package hw11;

import hw09.DayOfWeek;
import hw09.Pet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    Pet pet;
    HashMap<DayOfWeek, String> schedule = new HashMap<>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


    public Human() {
    }

    public Human(String name, String surname, String dateOfBirth, int iq) {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        try {
            setBirthDate(formatter.parse(dateOfBirth).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Human(String name, String surname, long birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
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


    public int getIq() {
        return iq;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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


    String describeAge() {
        return formatter.format(new Date(getBirthDate()));
    }
    public int ageCalculator(){
       int birthDate = new Date(getBirthDate()).getYear()+1900;
       int current = LocalDate.now().getYear();
       return current-birthDate;

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
        SimpleDateFormat formatChanger = new SimpleDateFormat("yyyy-MM-dd");
        String afterFormat = formatChanger.format(new Date(getBirthDate()));
        return String.format("Name: %s,Surname: %s,IQ:%d,BirthDate:%s,Schedule:%s "
                , getName(), getSurname(), getIq(), afterFormat, schedule);
    }

    @Override
    protected void finalize() {
        System.out.println("Human object deleted");
    }
}











