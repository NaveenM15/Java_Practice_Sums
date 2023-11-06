
// POLYMORPHISM -[  COMPILE TIME , RUNTIME ]
// COMPLIE TIME - METHOD OVERLOADING
// RUN TIME     - METHOD OVERRIDING

// METHOD OVERLOADING
class MathOperation{
    public static  int multiply(int x,int y){
        return x*y;
    }
    public static double multiply( double x,double y){
        return x*y;
    }
    public static double multiply(long x,double y,int z){
        return x*y*z;
    }
    public static double multiply(double x,double y,double z){
        return x*y*z;
    }
}
public class MethodOverLoading {
    public static void main(String[] args){
//        MathOperation in=new MathOperation();
        System.out.println("Multiplication : "+MathOperation.multiply(2,3));
        System.out.println("Multiplication : "+MathOperation.multiply(8.98906764435445,8));
        System.out.println("Multiplication : "+MathOperation.multiply(3,3.2,4));
        System.out.println("Multiplication : "+MathOperation.multiply(5.4,5.4,2.3));

    }
}
