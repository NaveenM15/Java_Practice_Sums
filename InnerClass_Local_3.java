
// PROGRAM FOR THE EXAMPLE OF LOCAL INNER CLASS
class Outer1{
    public void display(){
        class InnerIn{
            void display(){
                System.out.println("INNER-DISPLAY IS THE DISPLAY OF OUTER CLASS...");
            }
        }
        InnerIn io=new InnerIn();
        io.display();
        System.out.println("DISPLAY FROM OUTER...");
    }
}

public class InnerClass_Local_3 {
    public static void main(String[] args){
        Outer1 in=new Outer1();
        in.display();
//        Outer1.InnerIn inn =  in.InnerIn();
//        inn.display();
    }
}

