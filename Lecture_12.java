public class Lecture_12 {
    public static void main(String[] args) {
        int []array = arrays.createArray();
        System.out.println(binarySearch(array, 0));
    }

    //binary search
    public static int binarySearch(int[] array,int key){
        int start = 0;
        int end = array.length - 1;
        int mid = (start+end)/2;
        while(start <= end)
        {
            if(array[mid] == key)
            {
                return mid;
            }
            else if(key > mid)
            {
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
    
}
