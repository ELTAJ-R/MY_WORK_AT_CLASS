package hw04;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String schedule[][] = new String[7][2];


    public Human() {


    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;

    }

    public String greetPet() {
        return
                String.format("Hello," + pet.nickname);
    }

    public String describePet() {
        return
                String.format("I have a " + pet.species + " he is " + pet.age + " years old " + "he is " +
                        pet.assessTrick());

    }

    public String show() {
        return String.format(name + " " + surname);


    }

    public boolean feedpet() {
        int a = (int) (Math.random() * 100 + 1);
        if (pet.trickLevel > a) {
            System.out.println("Hm... I will feed Jack's " + pet.nickname);

            return true;
        } else {
            System.out.println("I think Jack is not hungry.");

            return false;
        }
    }


}





