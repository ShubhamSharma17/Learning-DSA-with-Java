import java.util.Scanner;

public class LectureZ_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println("String is " + name);
        // char ch = sc.next().charAt(0);
        // System.out.println("char is " + ch);

        //reverse string 
        // System.out.println("Enter a string");
        // String str = sc.nextLine();

        // String finalString = "";

        // for(int i = str.length()-1; i >= 0; i--)
        // {
        //     finalString = finalString + str.charAt(i);
        // }    
        // System.out.println("Reverse String is " + finalString);


        String s = "N2 i&nJA?a& jqI2n";
        System.out.println(checkPalindrome(s));
    }



    // 344. Reverse String
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start < end)
        {
            char tempChar = s[start];
            s[start++] = s[end];
            s[end--] = tempChar;
        }
    }


    // Check If The String Is A Palindrome
    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        int startIndex = 0;
        int endIndex = str.length() - 1;
        // boolean status = true;
        while (startIndex < endIndex) {
            if ((str.charAt(startIndex) >= 'a' && str.charAt(startIndex) <= 'z') || (str.charAt(startIndex) >= '0'
                    && str.charAt(startIndex) <= '9')) {
                if ((str.charAt(endIndex) >= 'a' && str.charAt(endIndex) <= 'z') || (str.charAt(endIndex) >= '0'
                        && str.charAt(endIndex) <= '9')) {
                    if (str.charAt(startIndex) != str.charAt(endIndex)) {
                        return false;
                    } else {
                        startIndex++;
                        endIndex--;
                        // status = false;
                    }
                } else {
                    endIndex--;
                    // status = false;
                }
            } else {
                startIndex++;
                // status = false;
            }
        }
        return true;
    }
    
}
