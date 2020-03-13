package hw08;


public class Fish extends Pet {
    Species species;
    private String nickname;
    private int age;
    private int trickLevel;


    public Fish(String nickname, int age, int trickLevel) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.species = Species.FISH;

    }

    @Override
    public String eat() {
        return super.eat();
    }


    @Override
    public String toString() {
        return String.format("Species:%s Nickname: %s,Age:%d,TrickLevel:%d,Habits:%s", species, nickname, age, trickLevel
                , habit);

    }

    @Override
    public String describeYourself() {
        return String.format("Hi,I am %s", nickname);
    }
}
