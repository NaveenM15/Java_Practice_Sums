
// PROGRAM TO RETURN ARRAY ELEMENTS IN METHODS
import java.util.Scanner;
import java.util.Arrays;

public class ReturningArray_Method
{
    public  static int[] sendArray() {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Nos: ");
        int n = io.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Elements: ");
            arr[i] = io.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String args[])
    {
      int arr[]=  sendArray();
      for(int a:arr){
          System.out.println(a);
      }
    }
}
