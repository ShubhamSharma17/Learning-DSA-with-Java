import java.util.ArrayList;

public class Lecture_13 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = arrayList.createArrayList();
        arrays.printArray(firstAndLastPosition(arrList, arrList.size(), 4));
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int size, int target) {
        int start = 0;
        int end = size-1;
        int mid = start + (end - start)/2;
        int left = -1 ;
        int right = -1 ;
        int [] array = new int[2];
        while(start <= end)
        {
            if(arr.get(mid) == target)
            {
                //call left most occureences
                left = leftOccurrnce(arr, start, mid, target);
                //call right most occureences
                right = rightOccurrnce(arr, mid, end, target);
                array[0] = left;
                array[1] = right;
                return array;
            }
            if(arr.get(mid) < target)
            {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
                array[0] = left;
                array[1] = right;
                return array;
    }

    //left most occurrence
    public static int leftOccurrnce(ArrayList<Integer> arr,int start, int end, int target){

        int left = -1;
        int mid = start + (end - start)/2;
        while(start <= end)
        {
            if(arr.get(mid) == target)
            {
                left = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return left;
    }
    //Rigth most occurrence
    public static int rightOccurrnce(ArrayList<Integer> arr,int start, int end, int target){
        int right = -1;
        int mid = start + (end - start)/2;
        while(start <= end)
        {
            if(arr.get(mid) == target)
            {
                right = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return right;
    }
    
}
