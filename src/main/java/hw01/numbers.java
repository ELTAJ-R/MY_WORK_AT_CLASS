package hw01;

import java.util.Random;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name: "+ name);
       System.out.println("Let the game begin!");
        Random guess = new Random();
        int a =(int)(Math.random()*100+1);
        System.out.println("Please guess the number");
        int b = scanner.nextInt();
      if(b<a){
          System.out.println("Your number is too small.Please try once more");}
      else if (b>a){
               System.out.println("Your number is bigger than correct one.One more attempt");
           }
           else{
           System.out.println("Congratulations,you found it,"+name);}
           while(b>a || b<a || b==a){
               System.out.println("Guess another number");


           }


       }

    }
}
