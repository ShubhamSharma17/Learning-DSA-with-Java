import java.util.ArrayList;

public class Lecture_14 {
    public static void main(String[] args) {
        int []arr = arrays.createArray();
        // System.out.println("Pivort element index is " + findPivort(arr));
        System.out.println(findPosition(arr, arr.length, 3));
    }

    //find pivort element in arr
    // aa = [7 9 11 15 0 2 3 4] ---  0  is a pivort element here
    public static int findPivort(int[] array){
        int start = 0;
        int end = array.length - 1;
        int mid = start + (end - start)/2;

        while(start < end)
        {
            if(array[mid] > array[array.length-1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
            mid = start + (end - start)/2;
        }
        return start;
    }

    //Search In Rotated Sorted Array
    public static int findPosition(int[] arr, int size, int key) {
        int[] array = new int[size];
        int result = 0;
        for(int i=0; i<size; i++){
            // array[i] = arr.get(i);
            array[i] = arr[i];
        }
        int pivortIndex = findPivort(array);

        if(key >= array[pivortIndex] && key <= array[size - 1]){
          result =  binarySearch(array, pivortIndex, size - 1, key);
        }
        else{
            result = binarySearch(array, 0, pivortIndex - 1, key);
        }
        return result;
    }

    public static int binarySearch(int[] array, int start, int end, int key)
    {
        int mid = start + (end - start)/2;
        while(start <= end)
        {
            if(array[mid] == key)
            {
                return mid;
            }
            if(array[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }
    
}
