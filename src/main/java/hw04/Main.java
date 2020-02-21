package hw04;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane","Karleone",1950);
        Human father = new Human("Vito","Karleone",1950);
        Pet dog = new Pet( "Rock",5,75,"Bulldog");
        Human child = new Human("Michael", "Karleone", 1977, 90,mother,father,dog) {
            @Override
            public String toString() {
                return String.format("Name: " + name + " Surname: " + surname + " Age: " + year + " IQ: " + iq +" Mother:  "+
                        mother.show()+" Father:  "+ father.show()+" About pet:  "+ dog.showanimal());
            }


        };

        System.out.println(child.greetPet());
        System.out.println(dog.respond());
        System.out.println(child.describePet());
        System.out.println(dog.eat());
        System.out.println(dog.foul());
        System.out.println(child);
    }

}