
public class LectureZ_22 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println("String is " + name);
        // char ch = sc.next().charAt(0);
        // System.out.println("char is " + ch);

        // reverse string
        // System.out.println("Enter a string");
        // String str = sc.nextLine();

        // String finalString = "";

        // for(int i = str.length()-1; i >= 0; i--)
        // {
        // finalString = finalString + str.charAt(i);
        // }
        // System.out.println("Reverse String is " + finalString);

        // String s = "N2 i&nJA?a& jqI2n";
        // System.out.println(checkPalindrome(s));

        // System.out.println(getMaxOccuringChar("output"));
        // StringBuilder str = new StringBuilder();
        // str.append("Hello World");
        // System.out.println(replaceSpaces(str));

        // System.out.println(removeOccurrences("daabcbaabcbc", "abc"));

        System.out.println(checkInclusion("ab", "eidboaoo"));

    }

    // 344. Reverse String
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
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

    // Maximum Occuring Character
    public static char getMaxOccuringChar(String line) {
        int[] arr = new int[26];
        int number = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            System.out.print(" " + (int) (ch - 'a'));
            number = ch - 'a';
            arr[number] += 1;
        }
        System.out.println();
        int max = -1;
        int ans = 0;
        for (int j = 0; j < 26; j++) {
            // System.out.print(" " + arr[j]);
            if (max < arr[j]) {
                ans = j;
                max = arr[j];
            }
        }
        return (char) ('a' + ans);
    }

    // Replace Spaces
    public static StringBuilder replaceSpaces(StringBuilder str) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                finalString.append("@40");
            } else {
                finalString.append(str.charAt(i));
            }
        }
        return finalString;
    }

    // 1910. Remove All Occurrences of a Substring
    public static String removeOccurrences(String s, String part) {
        int index = 0;
        int sLength = s.length();
        int pLength = part.length();
        while (s.contains(part)) {

            System.out.println(s);
            System.out.println(index);
            String front = "";
            String back = "";
            index = s.indexOf(part);
            if (index > 0) {
                front = s.substring(0, index);
            }
            if (index < index + pLength) {
                back = s.substring(index + pLength, sLength);
            }
            s = front + back;
            sLength = s.length();
        }

        return s;

    }

    // 567. Permutation in String
    public static boolean checkInclusion(String s1, String s2) {
        boolean check = false;
        int[] s1Array = new int[26];
        for (int a = 0; a < s1.length(); a++) {
            char c = s1.charAt(a);
            int n = c - 'a';
            s1Array[n] += 1;
        }
        // arrays.printArray(s1Array);
        int i = 0;
        int lastIndex = s1.length() - 1;
        while (i + lastIndex < s2.length()) {
            int[] tempArray = new int[26];
            for (int j = i; j <= lastIndex + i; j++) {
                char ch = s2.charAt(j);
                int number = ch - 'a';
                tempArray[number] += 1;
            }
            int k = 0;
                check = true;
                while (k < 26) {
                    if (s1Array[k] != tempArray[k]) {
                        check = false;
                    }
                    k++;
                }
                if(check)
                {
                    return check;
                }
            i++;
        }
        return check;
    }

}
