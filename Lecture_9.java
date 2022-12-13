import java.util.Scanner;

public class Lecture_9 {
    // Array
    public static void main(String[] args) {
        int[] array = createArray();
        reverseArray(array);
        printArray(array);
    }

    // Create an Array
    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size...");
        int size = sc.nextInt();
        int[] array = new int[size];
        // enter value in array
        System.out.println("Enter " + size + " Values");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;

    }

    //print array
    public static void printArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // find max and min in an array
    static void findMaxAndMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // find minimum value in array
            if (min > arr[i]) {
                min = arr[i];
            }

            // find maximum value in array
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value is " + min);
        System.out.println("Maximum value is " + max);
    }

    //reverse array
    public static void reverseArray(int[] arr)
    {
        int i = 0; 
        int j = arr.length-1;
        int temp = 0;
        while (i < j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    // //checking  arr in pass by value or pass by referance
    // static void check(int[] array)
    // {
    //     int n = 100;
    //     array[2] = n;
    //     // return array;

    // }



}
