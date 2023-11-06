
// Final Class Cannot Access by another class
// While we define class as final , we not able to inherit

//final class Beach{*****************
class Beach{
    void display(){
       System.out.println("Beach soil..");
    }
}
class Water extends Beach{
    void display(){
        System.out.println("It Appears Blue..");
    }
}
public class Final_Class_3 {
    public static void main(String[] args){
        Beach in= new Water();
        in.display();
    }
}
