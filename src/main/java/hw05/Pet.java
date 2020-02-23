package hw05;


public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String habits[] = new String[3];

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

    public Pet() {

    }

    public String showanimal() {
        return String.format(getSpecies() + " " + "Nickname: " + getNickname() + " Age: " + getAge() + " TrickLevel: " + getTrickLevel());

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
        return String.format("Hello, owner. I am " + getNickname() + ".I miss you!");
    }




        }
