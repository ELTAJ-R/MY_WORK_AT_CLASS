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


    public String showanimal() {
        return String.format(species + " " + "Nickname: " + nickname + " Age: " + age + " TrickLevel: " + trickLevel + " " +
                " Habits " + Arrays.toString(habits));

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
        return String.format("Hello, owner. I am " + nickname + ".I miss you!");
    }
}
