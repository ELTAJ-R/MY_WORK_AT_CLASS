package hw10;


import hw09.Species;

import java.util.HashSet;
import java.util.Objects;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;

    HashSet<String> habit = new HashSet();


    public Pet() {
        this.species = Species.UNKNOWN;
    }

    public Pet(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void setHabits(String habits) {
        habit.add(habits);
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public HashSet<String> getHabits() {
        return habit;
    }


    public abstract String describeYourself(); // this is respond() method

    public String toString() {
        return String.format("Species:%s Nickname: %s,Age:%d,TrickLevel:%d,Habits:%s", species, nickname, age, trickLevel
                , habit);

    }

    public String eat() {
        return "I am eating";

    }


    public String assessTrick() {
        if (getTrickLevel() > 50) {
            return "very sly";
        } else {

            return "not vey sly";
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
        Pet test = (Pet) object;
        if (test.getNickname() != getNickname()) return false;
        if (test.getAge() != getAge()) return false;
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.getNickname()) + Objects.hashCode(this.species)
                + Objects.hashCode(this.getAge()) + Objects.hashCode(this.getHabits());
        return hash;

    }

    @Override
    protected void finalize() {
        System.out.println("Pet object deleted");
    }
}

