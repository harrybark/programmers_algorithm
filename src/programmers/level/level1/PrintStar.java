package programmers.level.level1;

import java.util.InputMismatchException;
import java.util.Scanner;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.11.20
 * Programmers algorithm
 * 직사각형 별찍기
 */
public class PrintStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        try {
            System.out.print("input row : ");
            a = sc.nextInt();
            System.out.print("input col : ");
            b = sc.nextInt();

            String[][] rectangularArr = makeRectangularArr(a, b);

            printArray(rectangularArr);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("ETC ERROR.");
        } finally {

        }
    }

    private static String[][] makeRectangularArr(int a, int b) {
        String[][] arr = new String[b][a];
            for ( int i = 0 ; i < b ; i++ ) {
                for(int j = 0; j < a; j++){
                    arr[i][j] = "*";
                }
            }
        return arr;
    }

    private static void printArray(String[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            for (int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] );
            }
            System.out.println();
        }
    }

}
