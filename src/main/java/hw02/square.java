package hw02;



import java.lang.reflect.Array;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        Scanner scanner = new Scanner(System.in);
        int WidthOutput = (int) ((Math.random()) * 5 + 1);
        int HeightOutput = (int) ((Math.random()) * 5 + 1);
        String[][] square = new String[5][5];

        for (int width = 0; width < square.length; width++) {
            for (int height = 0; height < square.length; height++) {
                if (width < square.length || height < square.length) {

                    square[width][height] = " - |";

                }System.out.print(square[width][height]);

                }
            System.out.println("");}
        System.out.println("Enter a shooting bar(First the number for height,second for width)");
    for(;;){int WidthInput = scanner.nextInt()-1;
            int HeightInput = scanner.nextInt()-1;
            if(((WidthInput<=4)&&(WidthInput>0))&&((HeightInput<=4)&&(HeightInput>0))){

          if ((WidthInput == WidthOutput+1) && (HeightInput == HeightOutput+1)) {
              String[][] square1 = new String[5][5];
              for (int width1 = 0; width1 < square1.length; width1++) {
                  for (int height1 = 0; height1 < square1.length; height1++) {
                      if (width1 < square1.length || height1 < square.length) {

                          if(width1==WidthInput&&height1==HeightInput){square[width1][height1] = " X |";}
                      }
                      System.out.print(square[width1][height1]);
                  }
                  System.out.println("");}
              System.out.println("You have won!");break; }

            else{String[][] square1 = new String[5][5];
              for (int width1 = 0; width1 < square1.length; width1++) {
                  for (int height1 = 0; height1 < square1.length; height1++) {
                      if (width1 < square1.length || height1 < square.length) {

                          if(width1==WidthInput&&height1==HeightInput){square[width1][height1] = " * |";}
                      }
                      System.out.print(square[width1][height1]);
                  }
                  System.out.println("");}
              System.out.println("Enter another shooting bar");
              }}
    else{
                System.out.println("Entered number should be between 1-5,correct,please");

            }}
}}

