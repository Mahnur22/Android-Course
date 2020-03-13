public class HelloWorld {

    static String r = "Num is: ";

    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        int i = 4;
        int j = 9;
        int sum1 = x+y;
        int sum2 = i+j;

        if(sum1>sum2){
            System.out.println(r+sum1);

        }
         else if(sum1==sum2){
            System.out.println("The sum is equal.");
        }
         else if(sum2>sum1){
            System.out.println( r +sum2);
        }
         else {
            System.out.println(r+sum2);
        }



    }
}
