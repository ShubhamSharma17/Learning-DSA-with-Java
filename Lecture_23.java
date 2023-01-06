import java.util.Scanner;

public class Lecture_23 {        
    public static int[][] create_2_DArray(int array[][]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for 2-D array");
        System.out.print("Enter Number of Row :");
        System.out.println();
        int row = sc.nextInt();
        System.out.print("Enter Number of Column :");
        int column = sc.nextInt();
        //taking input from user
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                int number = sc.nextInt();
                array[i][j] = number;
            }
        }
        return array;
    }       
        
        //Print 2-D array
        public static void print_2_D_Array(int[][] array){
            int row = array.length;
            int column = array[0].length;
        for(int a = 0; a < row; a++)
        {
            for(int b = 0; b < column; b++)
            {
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
    }
    

     
    
}
