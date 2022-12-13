import java.util.Scanner;

public class Lecture_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        // System.out.println( reverseInteger(x));
        // System.out.println(bitwiseComplement(x));
        System.out.println(isPowerOfTwo(x));

        sc.close();

    }

    // 7. Reverse Integer -- leetcode
    public static int reverseInteger(int x) {
        int answer = 0;

        while (x != 0) {
            if (answer < Integer.MIN_VALUE / 10 && answer > Integer.MAX_VALUE) {
                return 0;

            }
            answer = (10 * answer) + (x % 10);
            x = x / 10;
        }
        return answer;
    }

    // 1009. Complement of Base 10 Integer

    public static int bitwiseComplement(int n) {

        // edge case
        if (n == 0) {
            return 1;
        }

        int m = n;
        int mask = 0;
        while (m != 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }

        return ((~n) & mask);
    }

    // 231. Power of Two
    public static boolean isPowerOfTwo(int n) {
        int count = 0;
        int temp = 0;
        if (n < 0) {
            return false;
        }
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            if (count > 1) {
                return false;
            }
            n = n >> 1;
        }
        return true;
    }

}
