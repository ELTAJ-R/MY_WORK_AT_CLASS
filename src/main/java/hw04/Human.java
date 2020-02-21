package hw04;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    static Pet pet;
    Human Mother;
    Human Father;
    String schedule[][] = new String[7][2];


    public Human() {


    }

    public Human(String name, String surname, int year, int iq, Human Mother, Human Father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.Mother = Mother;
        this.Father = Father;
        this.pet = pet;

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human Mother, Human Father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.Mother = Mother;
        this.Father = Father;

    }

    public String greetPet() {
        return
                String.format("Hello," + Pet.nickname);
    }

    public String describePet() {
        return
                String.format("I have a " + Pet.species + " he is " + Pet.age + " years old " + "he is " +
                        Pet.assessTrick());

    }

    public String show() {
        return String.format(name + " " + surname);


    }

    public boolean feedpet() {
        int a = (int) (Math.random() * 100 + 1);
        if (Pet.trickLevel > a) {
            System.out.println("Hm... I will feed Jack's " + Pet.nickname);

            return true;
        } else {
            System.out.println("I think Jack is not hungry.");

            return false;
        }
    }


}





