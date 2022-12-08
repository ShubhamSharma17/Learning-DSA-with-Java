import java.util.Scanner;

public class Lecture6 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Change number to binary....");
    //     System.out.println("Enter a number ");
    //     int number = sc.nextInt();
    //     int answer = 0;
    //     int i = 0;
    //     while(number != 0)
    //     {
    //         int digit = number & 1;
    //         answer =(int) (digit * Math.pow(10, i) + answer);
    //         number = number >> 1;
    //         i++;
    //     }
    //     System.out.println("Binary is " + answer);
    //     sc.close();
    // }


    public static void main(String[] args) {
        System.out.println("Binary to Decimal number..../");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binary = sc.nextInt();
        int answer = 0;
        int i= 0;
        while(binary != 0)
        {
            int digit = binary % 10;
            if(digit == 1)
            {
                answer = (int) Math.pow(2,i) + answer;
            }
            // System.out.println("checking     " + answer);
            i++;
            binary = binary /10;
        }
        System.out.println("Digit number is... " + answer);
        sc.close();

    }
    
}
