package hw10;

import hw09.DayOfWeek;
import hw09.Pet;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    Pet pet;
    private String dateOfBirth;
    HashMap<DayOfWeek, String> schedule = new HashMap<>();


    public Human() {
    }

    public Human(String name, String surname, String dateOfBirth, int iq) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
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


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.parse(getDateOfBirth(), formatter);
        int days = Period.between(dateOfBirth, now).getDays();
        int months = Period.between(dateOfBirth, now).getMonths();
        int years = Period.between(dateOfBirth, now).getYears();

        return String.format("Time passed since birth-Years:%d,Months:%d,Days:%d", years, months, days);


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
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate prev = LocalDate.parse(getDateOfBirth(), formatter1);
        String after = prev.format(formatter2);

        return String.format("Name: %s,Surname: %s,IQ:%d,BirthDate:%s,Schedule:%s "
                , getName(), getSurname(), getIq(), after, schedule);
    }

    @Override
    protected void finalize() {
        System.out.println("Human object deleted");
    }
}











