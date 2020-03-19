import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       /* for (int i = 0; i <= 5; i++) {
            if (i > 3) {
                System.out.println(i);
            }
        }*/

       int array [] = new int[10];

       //array [1] =10;


        //int count = input.nextInt();

        for (int i = 0; i < array.length ; i++) {
            System.out.println("Take your input:");
            array[i] = input.nextInt();
            System.out.println("Your output is: " +array[i]);
        }
    }
}