import java.util.ArrayList;

public class Lecture_21 {
    public static void main(String[] args) {
        // int[] array = arrays.createArray();
        // System.out.println(check(array));

        int[] arr1 = arrays.createArray();
        int[] arr2 = arrays.createArray();
        arrays.printArray(findArraySum(arr1, arr1.length, arr2, arr2.length));
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


        //1752. Check if Array Is Sorted and Rotated
        public static  boolean check(int[] nums) {
            int count = 0;
            int n = nums.length;
            for(int i = 1; i < n; i++)
            {
                if(nums[i - 1] > nums[i])
                    count++;
            }
            if(nums[n - 1] > nums[0])
                count++;

            return count <= 1;
        }

        // Sum Of Two Arrays
        public static int[] findArraySum(int[] a, int n, int[] b, int m) {
            int i = n - 1;
            int j = m - 1;
            int carry = 0;
            int sum = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            while(i >= 0 && j >= 0)
            {
                sum = a[i] + b[j] + carry;
                carry = sum / 10;
                sum = sum % 10;
                arrayList.add(sum);
                i--;
                j--;
            }
            while(i >= 0)
            {
                sum = a[i] + carry;
                carry = sum / 10;
                sum = sum % 10;
                arrayList.add(sum);
                i--;   
            }
            while(j >= 0)
            {
                sum = b[j] + carry;
                carry = sum / 10;
                sum = sum % 10;
                arrayList.add(sum);
                j--;   
            }
            if(carry > 0)
            {
                arrayList.add(carry);
            }

            int[] array = new int[arrayList.size()];
            int l = 0;
            for(int k = array.length-1; k >= 0; k--)
            {
                array[l++] = arrayList.get(k);
            }
            return array;            
        }
}
