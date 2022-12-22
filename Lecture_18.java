public class Lecture_18 {
    public static void main(String[] args) {
        int[] arr = arrays.createArray();
        arrays.printArray(insertionSort(arr));
    }

    //insertion Sort 
    public static int[] insertionSort(int[] array)
    {
            for(int i=1; i<array.length; i++)
            {
                int temp = array[i];
                int j = i - 1;
                while( j >= 0)
                {
                    if(array[j] > temp){
                        array[j + 1] = array[j];
                        j--;
                    }
                    else{
                        break;
                    }
                }
                array[j + 1] = temp;
            }

        return array;
    }
    
}
