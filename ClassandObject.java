
// CLASS AND OBJECTS IN JAVA
class Rectangle{
    private int length,width;
    void getDetails(int x,int y){
        length=x;
        width=y;
    }
    int area(){
        return length*width;
    }
}
// MAIN METHOD
public class ClassandObject {
    public static void main(String[] args)
    {
        Rectangle in=new Rectangle();
//        in.length=10;
//        in.width=20;
        System.out.println("Area of Rectangle: "+in.area());
        Rectangle in2=new Rectangle();
        in.getDetails(5,10);
        System.out.println("Area of Rectangle(2): "+in.area());
    }
}
