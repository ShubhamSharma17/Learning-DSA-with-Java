import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leetcode_1207{
    public static void main(String[] args) {
        int [] array =  Lecture10.createArray();
        System.out.println(uniqueOccurrences(array));
        
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(j < arr.length){
            while( j < arr.length && arr[i] == arr[j]){
                j++;
            }
            arrayList.add(j-i);
            i = j;
        }
        i = 0;
        j = 1;
        Collections.sort(arrayList);
        while( j < arrayList.size()){
            int num1 = arrayList.get(j);
            int num2 = arrayList.get(i);
            if( num1 <= num2){
                return false;
            }
            j++;
            i++;
        }
    return true;
    }
}