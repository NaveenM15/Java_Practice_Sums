

// PROGRAM TO  FIND FACTORIAL USING  RECURSION METHOD
class Recursion
{
    public int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
public class Recursion_Methods {
    public static void main(String[] args)
    {
        Recursion io=new Recursion();
        System.out.println("Factorial = "+io.fact(5));
    }
}
