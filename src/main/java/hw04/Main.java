package hw04;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Carol", "Carol", 1999, 100);
        Human father = new Human("Jack", "Jack", 1999, 100);
        Pet dog = new Pet( "Rock", 5, 75,"Bulldog");
        Human child = new Human("someone", "noone", 1999, 100) {
            @Override
            public String toString() {
                return String.format("name: " + name + "surname: " + surname + "age: " + year + "iq: " + iq +" "+
                        mother.show()+" "+ father.show()+" "+ dog.showanimal());
            }


        };

        System.out.println(child.greetPet());
        System.out.println(dog.respond());
        System.out.println(child.describePet());
        System.out.println(dog.eat());
        System.out.println(dog.foul());
    }

}