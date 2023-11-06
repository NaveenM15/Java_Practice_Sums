
// Default Constructor and Constructor OverLoading
class Box{
    float length,width;
    public Box(){// DEFAULT CONSTRUCTOR
        length=10;
        width=20;
    }
    public Box(float x,float y){// PARAMETERIZED CONSTRUCTOR
        length=x;
        width=y;
    }
    public Box(float x) {// PARAMETERIZED CONSTRUCTOR
        length = x;
        width = x;
        length=width=x;
    }
    float area(){
        float area =length*width;
        return area;

    }
}
public class DefaultConstructor_ConsOverloading {
    public static void main(String[] args){
        Box in=new Box();
        System.out.println("AREA :"+in.area());
        Box in1=new Box(2,3);
        System.out.println("AREA :"+in1.area());
        Box in2=new Box(8);
        System.out.println("AREA :"+in2.area());
    }
}
