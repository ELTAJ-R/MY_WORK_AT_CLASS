package hw01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Let the game begin!");
        Random guess = new Random();
        int a = (int) (Math.random() * 100 + 1);

            for (; ; ) {

            System.out.println("If you want to continue,press 1,else 0");

            int r = scanner.nextInt();


            if (r == 1) {


                System.out.println("Please guess the number");
                int b = scanner.nextInt();


                if (b < a) {
                    System.out.println("Your number is too small.Please try once more");
                } else if (b > a) {
                    System.out.println("Your number is bigger than correct one.One more attempt");
                } else {
                    System.out.println("Congratulations,you found it," + name);
                    ;
                }
            } else if (r == 0) {
                System.out.println("Game over");
                break;

            }
            else {
                System.out.println("Not defined");
            }
            ;
        }
        }
    }











