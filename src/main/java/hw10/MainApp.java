package hw10;

import java.text.ParseException;


public class MainApp {
    public static void main(String[] args) throws ParseException {
        Human child = new Human("Jack", "Karelone", "22/08/2015", 90);
        System.out.println(child.describeAge());
        System.out.println(child);


    }
}
