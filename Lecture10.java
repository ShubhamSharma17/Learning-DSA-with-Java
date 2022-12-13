import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lecture10 {
    public static void main(String[] args) {
        int[] newArray = createArray();
        System.out.println(findDuplicates(newArray));
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
    

    //Swap alternate
    public static void swapAlternate(int[] array){
        int i = 0;
        int j = i + 1;
        int temp = 0;
        while(i < array.length && j < array.length)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i += 2;
            j += 2;
        }
    }

    //Find Unique
    public static int findUnique(int[] arr){

      int ans = 0;
      for(int i=0; i<arr.length; i++)
      {
        ans = ans ^ arr[i];
      }
        return ans;
    }


    //442. Find All Duplicates in an Array
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        int i = 0;
        int j = i + 1;
        while(i < nums.length && j < nums.length){
            if(nums[i] == nums[j]){
                list.add(nums[i]);
                i += 2; 
                j += 2; 
            }
            else{
                
                i++;
                j++;
            }
        }
        return list;
    }

    //Intersection Of Two Sorted Arrays
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        int i =0;
        int j = 0;
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                i++;
            }
            else if(arr1.get(i) > arr2.get(j)){
                j++;
            }
            else {
                newArrayList.add(arr1.get(i));
                i++;
                j++;
            }
        }
        return newArrayList;
	}
}
