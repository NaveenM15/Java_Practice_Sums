
// *  CONSTRUCTORS - IT IS USED TO ASSIGN VALUE AND SET THE MEMORY ALLOCATION
//          TO ASSIGN A VALUE WHILE CREATING A OBJECT IN PRIVATE CLASS
// * when we are not giving any value to the variable
//     the constructor makes default value as ZERO.
// * The Constructor name = class name only access by[ PUBLIC, DEFAULT]
// TYPES
//   * DEFAULT
//   *PARAMETERIZED
//   *COPY

class Rect{
//    int length=10,width=40;
    int length,width;
       Rect(){
        System.out.println("\n*****CONSTRUCTOR CALLED*****");
        length=3;
        width=10;
    }
    int area(){
        return length*width;
    }
}
public class  Constructor_Methods {
    public static void main(String[] args){
        Rect in=new Rect();
        System.out.print("Area : "+in.area()+"\n");
//        System.out.print("Area : "+in.Rect());

    }
}
