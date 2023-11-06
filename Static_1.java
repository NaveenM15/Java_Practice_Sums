
// STATIC VARIABLE ANE STATIC METHODS
// There are two types
// * STATIC VARIABLES  - with Static
// * INSTANCE VARIABLES - Without Static

// while we define static method then it accept only Static Variable
// but Instance Variables can accept all values

class StaticTest{
    int a=10;
     static int b=30;
     void instance(){
         System.out.println("Instance  [ A = "+a+" B = "+b+"]");
     }
     static void display(){
         System.out.println("Static  B ="+b);
     }
}
public class Static_1 {
    public static void main(String[] args){
        StaticTest in=new StaticTest();
        System.out.println("Properties using Instance");
        System.out.println("\nNormal.......");
        in.instance();
        System.out.println("After Update.......");
        in.a=20;
        in.b=60;
        in.instance();
        System.out.println("\nNormal.......");
        in.display();
        System.out.println("After Update.......");
        in.b=900;
        in.display();
        System.out.println("\n______________________________\n");
        System.out.println("Properties using Static");
        System.out.println("\nNormal.......");
        in.instance();
        System.out.println("After Update.......");
        in.a=20;
        in.b=60;
        in.instance();
        System.out.println("\nNormal.......");
        in.display();
        System.out.println("After Update.......");
        in.b=900;
        in.display();
    }
}
