public class Lecture_17 {
    public static void main(String[] args) {
        int[] array = arrays.createArray();
        arrays.printArray(bubbleSort(array));
    }

    //bubble sort
    public static int[] bubbleSort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            int a = 0;
            int b = 1;
            while(b < arr.length - i)
            {
                if(arr[a] > arr[b])
                {
                    int temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }
                a++;
                b++;
            }
        }

        return arr;
    }
    
}
