
// ANONYMOUS INNER CLASS
// Anonymous inner class used to implement both abstract and interface in another class
abstract class Anonymous{
     abstract void display();
     public void show(){
         System.out.println("ANONYMOUS ABSTRACT CLASS");
     }

}
class Classic{
    public void displays(){
        Anonymous in=new Anonymous() {
            @Override
            void display() {
                System.out.println("From Abstract Class");
            }
        };
        in.display();
        in.show();
    }

}

public class InnerClass_Anonymous_4 {
    public static void main(String[] args){
        Classic io=new Classic();
        io.displays();
    }
}
