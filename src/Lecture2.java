import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


      /*  System.out.println("Enter your name and age:");
        String name = input.nextLine();
        int age = input.nextInt();

        System.out.println("your name: "+name + " \nyour age "+ age);*/

        int count = input.nextInt();

        for (int i = 1;i<=count; i=i+2){

            System.out.println(i);
        }

    }
}
