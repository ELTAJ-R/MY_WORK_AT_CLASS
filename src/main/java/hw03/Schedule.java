package hw03;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        String planner[][] = new String[7][2];
            planner[0][0] = "Monday";
            planner[0][1] = "do homework";
            planner[1][0] = "Tuesday";
            planner[1][1] = "do sport";
            planner[2][0] = "Wednesday";
            planner[2][1] = "go shopping";
            planner[3][0] = "Thursday";
            planner[3][1] = "go to the gym";
            planner[4][0] = "Friday";
            planner[4][1] = "submit assignments";
            planner[5][0] = "Saturday";
            planner[5][1] = "meet friends";
            planner[6][0] = "Sunday";
            planner[6][1] = "go to conversation";
        System.out.println("Please input the day of the week: ");
            Scanner scanner = new Scanner(System.in);
        String input =scanner.next();





                String nameOfDay=input.toLowerCase();





                switch (nameOfDay) {
                    case "monday":
                        System.out.println("Your task for Monday: " + planner[0][1]);
                        break;
                    case "tuesday":
                        System.out.println("Your task for Tuesday: " + planner[1][1]);
                        break;
                    case "wednesday":
                        System.out.println("Your task for Wednesday: " + planner[2][1]);
                        break;
                    case "thursday":
                        System.out.println("Your task for Thursday: " + planner[3][1]);
                        break;
                    case "friday":
                        System.out.println("Your task for Friday: " + planner[4][1]);
                        break;
                    case "saturday":
                        System.out.println("Your task for Saturday: " + planner[5][1]);
                        break;
                    case "sunday":
                        System.out.println("Your task for Sunday: " + planner[6][1]);
                        break;


                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                        break;
                    case "exit":
                        System.out.println("You exited the program");
                        break;




           }
            }

