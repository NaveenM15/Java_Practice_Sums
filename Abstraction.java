
// ABSTRACTION CLASS IN JAVA
//   * Data abstraction is the process of hiding certain details and showing only essential information to th user
// It can be achived by using
//      * [abstract class and interfaces]
abstract class Shapes{
     abstract void draw();
     void Message(){
        System.out.println("Message From Drawing.");
    }
}
class Diamond extends Shapes{
    @Override
    void draw(){
       System.out.println("This Shape is Diamond.");
    }
}
public class Abstraction {
    public static void main(String[] args){
         Shapes input=new Diamond();
         input.draw();
         input.Message();
    }
}
