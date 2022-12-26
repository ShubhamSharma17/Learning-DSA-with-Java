import java.util.Scanner;

public class arrays {
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
        // sc.close();
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
    
}
