
// Data Hiding Getter and Setter
// Data Hiding - Hide the Data ,
// Getter - Get the Data  [Return]
// Setter - Set the Input [Assign]

class ShapeRectangle{
    // PRIVATE ACCESS SPECIFIER
    private int length,width;
    // GETTER METHOD TO ACCESS PRIVATE CLASS
    int getLength(){return length;}
    int getWidth(){return width;}
    // SETTER METHOD TO ACCESS PRIVATE CLASS
    void setLength(int l){
        length=l;
    }
    void setWidth(int w){width=w;}
    int area(){return length*width;}
}
public class DataHiding_GetterAndSetter {
    public static void main(String[] args){
        ShapeRectangle in=new ShapeRectangle();
        in.setLength(10);
        in.setWidth(20);
        System.out.println("Area : "+in.getLength());
        System.out.println("Area : "+in.getWidth());


        System.out.println("Area : "+in.area());


    }
}
