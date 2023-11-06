
// Program of Nested inner class
// A Class written in another Class.

class Outer{
    int a=10;
    class Inner{
        int b=20;
        void display(){
            System.out.println("INNER DISPLAY.");
            System.out.println(" A = "+a);
            System.out.println(" B = "+b);
        }
    }
    public void display(){
        System.out.println("OUTER DISPLAY.");
        System.out.println(" A = "+a);
        Inner in=new Inner();
        System.out.println(" B = "+in.b);
    }
}
public class InnerClass_Nested_2 {
    public static void main(String[] args){
        Outer io=new Outer();
        io.display();
        Outer.Inner n=new Outer().new Inner();
        n.display();
    }
}
