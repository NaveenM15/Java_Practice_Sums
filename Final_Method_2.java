
// FINAL METHODS IN JAVA
// We not able to overriding the final methods

class SuperClass{
    void display(){
        System.out.println(" SuperClass Display.");
    }
    final void displays(){
        System.out.println("SuperClass Final Display");
    }
}
class SubClass extends SuperClass{
    public void display(){
        System.out.println(" SubClass  Display.");
    }

}

public class Final_Method_2 {
    public static void main(String[] args){
         SuperClass in=new SubClass();
         in.display();
        in.displays();
    }
}
