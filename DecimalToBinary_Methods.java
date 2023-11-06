
//PROGRAM TO CONVERT DECIMAL TO BINARY
import java.util.Scanner;

public class DecimalToBinary_Methods {
    public static void binary(int d){
        int[] bi=new int[10000];
        int i=0;
        while(d>0)
        {
           bi[i]=d%2;
           d=d/2;
           i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(bi[j]+" ");
        }

    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter D :");
        int d=input.nextInt();
        System.out.println("Decimal No: "+d);
        System.out.print("Binary No: ");
        binary(d);

    }
}
