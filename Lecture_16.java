public class Lecture_16 {
    public static void main(String[] args) {
        int[] array = arrays.createArray();
        arrays.printArray(selectionSort(array));
    }
    
    //selection sort
    public static int[] selectionSort(int[] arr)
    {
        for(int i=0; i< arr.length - 1; i++)
        {
            int smallIndex = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[smallIndex] > arr[j])
                {
                    smallIndex = j;
                }
            }
            int temp = arr[smallIndex];
            arr[smallIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
