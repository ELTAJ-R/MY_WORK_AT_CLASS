package hw04;


import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String habits[] = new String[3];

    public Pet() {

    }


    public Pet(String nickname, int age, int trickLevel, String species, String habits[]) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String nickname, String species) {
        this.nickname = nickname;
        this.species = species;

    }


    @Override
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
        if (trickLevel > 50) {
            return "very sly";
        } else {

            return "not vey sly";
        }
    }

    public String respond() {
        return String.format("Hello,owner.I am %s.I miss you!", nickname);
    }
}
