public class Lecture_14 {
    public static void main(String[] args) {
        // int []arr = arrays.createArray();
        // System.out.println("Pivort element index is " + findPivort(arr));
        // System.out.println(findPosition(arr, arr.length, 3));
        System.out.println(square(1524845.358, 3));
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


    //69. Sqrt(x)
    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid = start + (end - start)/2;
        int ans = 0;
        
        while(start <= end)
        {
            //edge case
            if(x == 2){
                return 1;
            }

            if(mid == x){
                return mid;
            }
            if((double)mid*mid > x ){
                end = mid - 1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }


    //suare root with decimal
    public static double square(double number, int precision)
    {
        double temp = mySqrt((int)number);
        int i = 0;
        double factor = 1;
        double ans = 0;
        while(i < precision)
        {
            factor = factor / 10;
            for(double j = temp; (j*j) <= number; j = j + factor){
                ans = j;
            }
            i++;
            temp = ans;
        }
        return ans;
    }
}
