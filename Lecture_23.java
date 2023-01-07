import java.util.Scanner;

public class Lecture_23 {        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value for 2-D array");
        // System.out.print("Enter Number of Row :");
        // System.out.println();
        // int row = sc.nextInt();
        // System.out.print("Enter Number of Column :");
        // int column = sc.nextInt();
        // int [][]arr = new int[row][column];

        // print column vise
        // for(int i = 0; i < row; i++)
        // {
        //     for(int j = 0; j < column; j++)
        //     {
        //         arr[j][i] = sc.nextInt();
        //     }
        // }

        // create array
        int[][] array = two_D_arrays.create_2_DArray();


        // System.out.println("Enter target number: ");
        // int target = sc.nextInt();
        // System.out.println(isPresent(array,  target));

        two_D_arrays.print_2_D_Array(array);

        // rowSum(array);

        // columnSum(array);

        maxSumRow(array);

        
    }

    // method for searching target element
    public static boolean isPresent(int[][] array,   int target){
        int column = array[0].length;
        int row = array.length;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                if(target == array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    //method of row wise sum
    public static void rowSum(int[][] array)
    {
        int column = array[0].length;
        int row = array.length;
        for(int i=0; i<row; i++)
        {
            int sum = 0;
            for(int j=0; j<column; j++)
            {
                sum = sum + array[i][j];
            }
            System.out.println("Sum of row " + (1+i) + " is " + sum);
        }
    }



    //method of row wise sum
    public static void columnSum(int[][] array)
    {
        int column = array[0].length;
        int row = array.length;
        for(int i=0; i<row; i++)
        {
            int sum = 0;
            for(int j=0; j<column; j++)
            {
                sum = sum + array[j][i];
            }
            System.out.println("Sum of column " + (1+i) + " is " + sum);
        }
    }

    // method of check maximum sum of  row
    public static void maxSumRow(int[][] array)
    {
        int column = array[0].length;
        int row = array.length;
        int maxSum = 0;
        int rowNumber = 0;
        for(int i=0; i<row; i++)
        {
            int sum = 0;
            for(int j=0; j<column; j++)
            {
                sum = sum + array[i][j];
            }
            // System.out.println("Sum of column " + (1+i) + " is " + sum);
            if(sum > maxSum)
            {
                maxSum = sum;
                rowNumber = (i+1);
            }
        }        System.out.println("the maximum sum of row "+ rowNumber + " is " + maxSum);
    }
}
