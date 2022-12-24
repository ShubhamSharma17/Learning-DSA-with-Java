public class Lecture_21 {
    public static void main(String[] args) {
        System.out.println(3 % 7);
        // int[] array = arrays.createArray();
        // rotate(array, 4);
        // arrays.printArray(array);
    }


    //189. Rotate Array
    // public static void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     int []temp = new int[n];
    //     int i = 0;
    //     while(i < n)
    //     {
    //         temp[(i + k) % n] = nums[i];
    //         i++;
    //     }
    // }


    //second method
        public static void rotate(int[] nums, int k) {
            k=k%nums.length;
    
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
    
        public static void reverse(int nums[],int start,int end)
        {
            while(start<end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
    
        }
}
