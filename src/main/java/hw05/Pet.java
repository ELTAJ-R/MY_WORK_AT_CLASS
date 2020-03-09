package hw05;


import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {

    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void setSpecies(String species) {
        this.species = species;
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


    public String getSpecies() {
        return species;
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

    public String[] getHabits() {
        return habits;
    }


    public String toString() {
        return String.format("%s Nickname: %s,Age:%d,TrickLevel:%d,Habits:%s", species, nickname, age, trickLevel
                , Arrays.toString(habits));

    }

    public String eat() {
        return String.format("I am eating");

    }

    public String foul() {
        return String.format("I need to cover it up");
    }

    public String assessTrick() {
        if (getTrickLevel() > 50) {
            return "very sly";
        } else {

            return "not vey sly";
        }
    }

    public String respond() {
        return String.format("Hello, owner. I am %s.I miss you!", getNickname());
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
        if (!test.getNickname().equals(getNickname())) return false;
        if (test.getAge() != getAge()) return false;
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.getNickname()) + Objects.hashCode(this.getSpecies())
                + Objects.hashCode(this.getAge()) + Objects.hashCode(this.getHabits());
        return hash;
    }
}

