package hw04;



public class Pet {
    static   String species;
    static String nickname;
    static int age;
    static  int trickLevel;
    static String habits[];


    Pet(String nickname,int age,int trickLevel,String species) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }


    public String showanimal(){
        return String.format("Nickname: "+nickname+" age: "+age+"trickLevel: "+trickLevel);

    }
    public String eat(){
        return String.format("I am eating");

    }
    public String foul(){
        return String.format("I need to cover it up");
    }
   public String respond(){
        return String.format("Hello, owner. I am " +nickname+ ".I miss you!");
   }
}
