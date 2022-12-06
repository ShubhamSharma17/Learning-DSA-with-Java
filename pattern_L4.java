import java.util.Scanner;

public class pattern_L4 {
    public static void main(String[] args) {

        //pattern - 1

//        int row = 3;
//        for (int i=0;i<row;i++)
//        {
//            // 1 2 3
//           /* for (int j=1;j<=row;j++)
//            {
//                System.out.print(j + "  ");
//            }
//            */

//            //  3  2  1
//            for (int j=row;j>0;j--)
//            {
//                System.out.print(j + "  ");
//            }
//            System.out.println();
//        }

        //pattern - 2
//        int row = 2;
//        int number = 1;
//        for (int i = 0; i< row; i++)
//        {
//            for (int j=0; j < row; j++)
//            {
//                System.out.print(number++ + "  " );
//            }
//            System.out.println();
//        }


        //pattern - 3
//        int n = 4;
//        for (int i=0;i<n;i++)
//        {
//            for (int j=0;j<=i;j++)
//            {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }


        //pattern - 4
//        int  row = 3;
//        for (int i=0; i<row; i++)
//        {
//            for(int j=0; j<=i; j++)
//            {
//                System.out.print(i + 1 +" ");
//            }
//            System.out.println();
//        }


//        pattern - 5
//        int row = 4;
//        int number = 1;
//        for (int i=1;i<=row; i++)
//        {
//            for (int j=1; j<=i; j++)
//            {
//                System.out.print(number++ + "  ");
//            }
//            System.out.println();
//        }


        //pattern - 6
//        int colum = 5;
//        for (int i=1; i<=colum; i++)
//        {
//            for (int j=i; j>=1; j--)
//            {
//                System.out.print(j + "    ");
//            }
//            System.out.println();
//        }


//        pattern - 7
//        int colum = 3;
//        for (int i=1; i<=colum; i++)
//        {
//            for (int j=0; j<colum; j++)
//            {
//                char ch =(char)(65+  i - 1);
//                System.out.print(ch  + "  ");
//            }
////            ch++;
//            System.out.println();
//        }


        //patter - 8
//        int colum = 3;
//        for (int i=1; i<=colum; i++)
//        {
//            for (int j=1; j<=colum; j++)
//            {
//                char ch = (char)('A' + j -1);
//                System.out.print(ch + "  ");
//            }
//            System.out.println();
//        }


        //pattern - 9
//        int colum = 3;
//        char ch=64;
//        for (int i=1; i<=colum; i++)
//        {
//            for (int j=1; j<=colum; j++)
//            {
//                ch = (char)(ch+1);
//                System.out.print(ch + "  ");
//            }
//            System.out.println();
//        }


        //pattern - 10
        // 'A' = 65
//        int column = 3;
//        for (int i=1; i<=column; i++)
//        {
//            for (int j=1; j<=column; j++)
//            {
//                char ch = (char)('A' + (i + j - 2));
//                System.out.print(ch + "  ");
//            }
//            System.out.println();
//        }


        //pattern  -  11
//        int column = 3;
//        for (int i=1; i<=column; i++)
//        {
//            for (int j=1; j<=i; j++)
//            {
//                char ch = (char)('A'+i-1);
//                System.out.print(ch + "  ");
//            }
//            System.out.println();
//        }


        //pattern  -  12
//        int column = 4;
//        char ch = 'A';
//        for (int i=1; i<=column; i++)
//        {
//            for (int j=1; j<=i; j++)
//            {
//                System.out.print(ch + "  ");
//                ch =(char)( ch + 1);
//            }
//            System.out.println( );
//        }



        //pattern  -  13
//        int column = 4;
//        for (int i=1; i<=column; i++)
//        {
//            for (int j=1; j<=i; j++)
//            {
//                char ch = (char)('A'+i+j-2);
//                System.out.print(ch + "  ");
//            }
//            System.out.println( );
//        }


        //pattern  -  14
//        int column = 4;
//        int number =1;
//        for (int i=column; i>=1; i--)
//        {
//            for (int j=1; j<=number; j++)
//            {
//                char ch = (char)( 'A' + i + j - 2);
//                System.out.print(ch + "  ");
//            }
//            number++;
//            System.out.println( );
//        }


//        //pattern  -  15
//        Scanner takeInput = new Scanner( System.in);
//        System.out.println("Enter number of rows. ");
//        int lines = takeInput.nextInt();
//        int row = 1;
//        int colum = 1;
//        while (row <= lines)
//        {
//            int space = lines - row;
//            while (space >= 1)
//            {
//                System.out.print("  ");
//                space--;
//            }
//            int star = row;
//            while (star >= 1 )
//            {
//                System.out.print("* ");
//                star--;
//            }
//            System.out.println();
//            row++;
//        }



//        //pattern  -  16
//        Scanner takeInput = new Scanner( System.in);
//        System.out.println("Enter number of rows. ");
//        int lines = takeInput.nextInt();
//        int row = 1;
//        int colum = 1;
//        while (row <= lines)
//        {
//            int star = lines - row + 1;
//            while (star >= 1 )
//            {
//                System.out.print("* ");
//                star--;
//            }
//            System.out.println();
//            row++;
//        }



        //pattern  -  17
//        Scanner takeInput = new Scanner( System.in);
//        System.out.println("Enter number of rows. ");
//        int lines = takeInput.nextInt();
//        int row = 1;
//        int colum = 1;
//        while (row <= lines)
//        {
//            int space = row - 1;
//            while (space >= 1)
//            {
//                System.out.print("  ");
//                space--;
//            }
//            int star = lines - row + 1;
//            while (star >= 1 )
//            {
//                System.out.print("* ");
//                star--;
//            }
//            System.out.println();
//            row++;
//        }



//        //pattern  -  18
//        Scanner takeInput = new Scanner( System.in);
//        System.out.println("Enter number of rows. ");
//        int lines = takeInput.nextInt();
//        int row = 1;
//        int colum = 1;
//        while (row <= lines)
//        {
//            int space = row - 1;
//            while (space >= 1)
//            {
//                System.out.print("  ");
//                space--;
//            }
//            int number = lines-row+1;
//            while (number >= 1 )
//            {
//                System.out.print(row + " ");
//                number--;
//            }
//            System.out.println();
//            row++;
//        }


//        //pattern  -  19
//        Scanner takeInput = new Scanner( System.in);
//        System.out.println("Enter number of rows. ");
//        int lines = takeInput.nextInt();
//        int row = 1;
//        int colum = 1;
//        while (row <= lines)
//        {
//            int space = lines - row;
//            while (space >= 1)
//            {
//                System.out.print("  ");
//                space--;
//            }
//            int number = row;
//            while (number >= 1 )
//            {
//                System.out.print(row + " ");
//                number--;
//            }
//            System.out.println();
//            row++;
//        }


        //pattern  -  20
//        Scanner takeInput = new Scanner( System.in);
//        System.out.println("Enter number of rows. ");
//        int lines = takeInput.nextInt();
//        int row = 1;
//        int colum = 1;
//        while (row <= lines)
//        {
//            int space = row - 1;
//            while (space >= 1)
//            {
//                System.out.print("  ");
//                space--;
//            }
//            int number = row;
//            while (number <= lines )
//            {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//            row++;
//        }



//        //pattern  -  21
//        Scanner takeInput = new Scanner( System.in);
//        System.out.println("Enter number of rows. ");
//        int lines = takeInput.nextInt();
//        int row = 1;
//        int colum = 1;
//        int number = 1;
//        while (row <= lines)
//        {
//            int space = lines - row;
//            while (space >= 1)
//            {
//                System.out.print("  ");
//                space--;
//            }
//            int temp = row;
//            while (temp >= 1 )
//            {
//                System.out.print(number + " ");
//                number++;
//                temp--;
//            }
//            System.out.println();
//            row++;
//        }


        //pattern  -  22
//        Scanner takeInput = new Scanner( System.in);
//        System.out.println("Enter number of rows. ");
//        int lines = takeInput.nextInt();
//        int row = 1;
//        int colum = 1;
//        while (row <= lines)
//        {
//            int space = lines - row;
//            while (space >= 1)
//            {
//                System.out.print("  ");
//                space--;
//            }
//            int number = 1;
//            while (number <= row)
//            {
//                System.out.print(number + " ");
//                number++ ;
//            }
//
//            int number2 = row - 1;
//            int temp = number - 2;
//            while (number2 >= 1)
//            {
//                System.out.print(temp + " ");
//                temp--;
//                number2--;
//            }
//
//            System.out.println();
//            row++;
//        }



        //pattern  -  23
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines...");
        int lines = sc.nextInt();
        int row = 1;
        int colum = 1;
        while(row <= lines)
        {
                //part - 1
                //number
                int digit1 = lines - row + 1;
                for(int i=1; i<= digit1; i++)
                {
                        System.out.print(i + "  ");
                }

                // star
                int star1 = row - 1;
                while(star1 >= 1)
                {
                  System.out.print("*  ");       
                  star1--;
                }

                //part - 2
                //star
                int star2 = row - 1;
                while(star2 >= 1)
                {
                  System.out.print("*  ");       
                  star2--;
                }

                //digit
                int digit2 = lines - row + 1;
                for(int j=digit2; j>=1; j--)
                {
                        System.out.print(j + "  ");
                }
                System.out.println();
                row++;
        }

    }
}
