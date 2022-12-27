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


        String s = "N2 i&nJA?a& jnI2n";
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
        int s = 0;
        int e = str.length() - 1;
        while(s < e)
        {
            if( (str.charAt(s) >= 'a' && str.charAt(s) <= 'z') || (str.charAt(s) >= 'A' && str.charAt(s) <= 'Z') ){
                if( (str.charAt(e) >= 'a' && str.charAt(e) <= 'z') || (str.charAt(e) >= 'A' && str.charAt(e) <= 'Z')  ){
                    if(str.charAt(s) != str.charAt(e)){
                        return false;
                    }
                    s++;e--;
                }
                else{
                    e--;
                }
            }
            else{
                s++;
            }
        }
        return true;
	}
    
}
