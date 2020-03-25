import java.util.Scanner;

public class ArrayList5 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter your Name:");
            input.nextLine();
            String m = input.nextLine();
            System.out.println("Enter your Total Salary");
            float totalSal = input.nextFloat();


            float grossSal = (totalSal * 15) / 100 + totalSal;


            System.out.println(m + "\n Total Salary:" + "\n" + "Your Gross Salary is " + grossSal);

        }


    }
}