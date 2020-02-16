package hw02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {for(;;){
        Scanner scanner = new Scanner(System.in);
        String[][] square = new String[5][5];
        for (int width = 0; width < square.length; width++) {
            for (int height = 0; height < square.length; height++) {
                if (width < square.length || height < square.length) {

                    square[width][height] = " - |";



                    }
                System.out.print(square[width][height]);
                }
            System.out.println("");}
            int WidthInput = scanner.nextInt();
            int HeightInput = scanner.nextInt();
            int WidthOutput = (int) ((Math.random()) * 5 + 1);
            int HeightOutput = (int) ((Math.random()) * 5 + 1);


          if ((WidthInput == WidthOutput) && (HeightInput == HeightOutput)) {
                square[WidthInput][HeightInput] = " X ";
                }
            else{square[WidthInput][HeightInput] =" *";}
            System.out.print(square[WidthInput][HeightInput]);}



        }

    }


