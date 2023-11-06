
// STATIC INNER CLASS
// Static inner class , use static key word in inner class
class Outer2{
     static int a=10;
    int b=20;
    public void display(){
        System.out.println("Outer Display...");
    }
     static class Inner2{
        void display(){
            System.out.println("Inner Display...");
            System.out.println("A= "+a);
        }

    }
}


public class InnerClass_Static_5 {
    public static void main(String[] args){
      Outer2.Inner2 in= new Outer2.Inner2();
      in.display();
    }
}
