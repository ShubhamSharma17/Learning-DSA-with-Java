import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    //create array list
    public static ArrayList createArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size for Array List");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " value for array list");
        for(int i=0; i<size; i++)
        {
            arrayList.add(sc.nextInt());
        }
        return arrayList;
    }
    

    //print array list
    public static void printArrayList(ArrayList arrayList){
        for(int i = 0; i < arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
