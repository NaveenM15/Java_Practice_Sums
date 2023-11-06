
// TYPES OF USER DEFINED METHODS IN JAVA*****************
// METHODS IS SIMILAR TO FUNCTION IN C
// WE HAVE TO USE BEFORE THE MAIN FUNCTION
import java.util.Scanner;
class Method {
    //without return without argument
    public void add()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = input.nextInt();
        System.out.println("Enter B: ");
        int b = input.nextInt();
        System.out.println("Addition : " + (a + b));
    }
//   No return with arguments
     public void sub(int a, int b)
    {

        System.out.println("Subtraction : "+(a-b));
    }
    // with return without Arguments
    public int  mul(){
        int a=2;
        int b=3;
         return a*b;
    }
    // with return with Argument
    public float div(float x,float y)
    {
        return (x/y);
    }

}
public class UserDefined_Methods {
    public static void main(String[] args)
    {
         Method io=new Method();
         io.add();
         System.out.println("**************************");
        Scanner none=new Scanner(System.in);
        System.out.println("Enter A: ");
        int a=none.nextInt();
        System.out.println("Enter B: ");
        int b=none.nextInt();
        io.sub(a,b);
        System.out.println("**************************");
        System.out.println(" Multiple : "+io.mul());
        System.out.println(" Division : "+ io.div(10,2));
    }

}
