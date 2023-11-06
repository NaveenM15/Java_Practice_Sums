
// PROGRAM TO CONVERT BINARY TO DECIMAL
import java.util.Scanner;
public class BinaryToDecimal_Method {
    public static int decimal(int n){
        // 1010=> 0*2^1
        int result=0,i=0;
        while(n!=0){
            int rem=n%10;
            result+=rem* Math.pow(2,i);
            n=n/10;
            i++;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Binary: ");
        int n=input.nextInt();
        System.out.println("Binary  : "+n);
        System.out.println("Decimal :"+decimal(n));

    }
}
