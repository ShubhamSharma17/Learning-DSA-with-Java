public class Lecture_20 {
    public static void main(String[] args) {
        int[] array1 = arrays.createArray();
        int[] array2 = arrays.createArray();
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
    
}
