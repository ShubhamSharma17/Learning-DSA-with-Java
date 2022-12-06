import java.util.Scanner;

public class Lecture5 {
    // subtract the product and sum from a digit
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int number = sc.nextInt();
        // int product = 1;
        // int sum = 0;
        // while(number > 0)
        // {
        //     product = product * (number%10);
        //     sum = sum + (number%10);
        //     number = number / 10;
        // }
        // int result = product - sum;
        // System.out.println(product + " is product");
        // System.out.println(sum+ " is sum");
        // System.out.println(result+ " is result");
        // sc.close();
        // }

        //191. Number of 1 Bits
       public static void main(String[] args) {
         int n = 00000000000000000000000000001011;
         int count = 0;
          while(n != 0)
          { 
             if((n&1) == 1){
                count++;
            }
            n = n >> 1;
          }
          System.out.println(count); 
       }


    
}
