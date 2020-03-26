package hw10;


public class MainApp {
    public static void main(String[] args) {
        Human child = new Human("Jack", "Karelone", 905607861000L, 90);
        Human adoptedChild = new Human("Jane", "Karleone", "12/09/1998", 100);

        System.out.println(child.describeAge());
        System.out.println(adoptedChild.describeAge());

        System.out.println(child);
        System.out.println(adoptedChild);


    }
}
