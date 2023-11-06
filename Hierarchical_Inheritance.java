
// HIERARCHICAL INHERITANCE IN JAVA
// one Base class, Multiple Derived Class
// PROGRAM TO FIND AREA OF DIFFERENT SHAPES
class Shape{
    float length,width,radius;
}
class Rect1 extends Shape{
    public Rect1(int l,int w)
    {
        length=l;
        width=w;
    }
    float area(){
        return length*width;
    }
}
class Circle extends Shape{
    public Circle(float r){
        radius=r;
    }
    float area(){
        return ((float)3.14*radius*radius);
    }
}
class Square extends Shape{
    public Square(float l){
        length=l;
    }
    float area(){
        return length*length;
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args){
            Rect1 o1=new Rect1(3,4);
            System.out.println("Area Of Rectangle: "+o1.area());

            Circle o2=new Circle(5);
            System.out.println("Area Of Rectangle: "+o2.area());

             Square o3=new Square(10);
            System.out.println("Area Of Rectangle: "+o3.area());

    }
}
