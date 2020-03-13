package hw07;

import java.util.Arrays;

public class Fish extends Pet {
    Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;


    public Fish() {
        this.species = Species.FISH;
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }

    @Override
    public String eat() {
        return super.eat();
    }


    @Override
    public String toString() {
        return String.format("Species:%s Nickname: %s,Age:%d,TrickLevel:%d,Habits:%s", species, nickname, age, trickLevel
                , Arrays.toString(habits));

    }

    @Override
    public String describeYourself() {
        return String.format("Hi,I am %s", nickname);
    }
}
