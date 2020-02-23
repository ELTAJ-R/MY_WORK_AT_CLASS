package hw04;


public class Pet {
    static String species;
    static String nickname;
    static int age;
    static int trickLevel;
    static String habits[] = new String[3];

    public Pet() {

    }


    public Pet(String nickname, int age, int trickLevel, String species) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public Pet(String nickname, String species) {
        this.nickname = nickname;
        this.species = species;

    }


    public String showanimal() {
        return String.format(species + " " + "Nickname: " + nickname + " Age: " + age + " TrickLevel: " + trickLevel);

    }

    public String eat() {
        return String.format("I am eating");

    }

    public String foul() {
        return String.format("I need to cover it up");
    }

    public static String assessTrick() {
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