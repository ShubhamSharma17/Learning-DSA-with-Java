public class Lecture_20 {
    public static void main(String[] args) {
    }

    //88. Merge Sorted Array
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;
        while(j >= 0 && i >= 0)
        {
            if(nums1[i] >= nums2[j]){
                nums1[lastIndex--] = nums1[i--];
            }
            else{
                nums1[lastIndex--] = nums2[j--];
            }
        }
        while(i >= 0)
         {
                nums1[lastIndex--] = nums1[i--];
         }
         while(j >= 0){
                nums1[lastIndex--] = nums2[j--];
         }
    }

    //283. Move Zeroes
    public void moveZeroes(int[] nums) {
        int number = 0;
        int i = 0;
        while(i < nums.length){

            if(nums[i] != 0){
                //swap the number and zero
                int temp = nums[i];
                nums[i] = nums[number];
                nums[number] = temp;
                number++;
            }
            i++;
        }
    }
    
}
