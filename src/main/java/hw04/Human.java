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

    @Override
    public String toString() {
        return String.format("Name: %s,Surname: %s,Age:%d,IQ:%d,Mother: %s,Father: %s,About pet: %s", name, surname, year, iq,
                mother.show(), father.show(), pet);
    }

    public String greetPet() {
        return
                String.format("Hello,%s", pet.nickname);
    }

    public String describePet() {
        return
                String.format("I have a %s.He is %d years old and he is %s", pet.species, pet.age, pet.assessTrick());

    }

    public String show() {
        return String.format("%s %s", name, surname);


    }

    public boolean feedpet() {
        int a = (int) (Math.random() * 100 + 1);
        if (pet.trickLevel > a) {
            System.out.println("Hm... I will feed  " + pet.nickname);

            return true;
        } else {
            System.out.println("I think " + pet.nickname + " is not hungry.");

            return false;
        }
    }


}





