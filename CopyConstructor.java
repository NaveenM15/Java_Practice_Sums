
// Copy Constructor in Java
// PROGRAM TO FIND ADDITION OF TWO COMPLEX NUMBER
//       BY USING COPY CONSTRUCTOR


class Complex{
    int real,img;
    public Complex(){
        this.real=10;
        this.img=20;
    }
    public Complex(int x,int y){
        this.real=x;
        this.img=y;
    }
    public Complex(Complex o2){
        this.real=o2.real;
        this.img=o2.img;
    }
    public String toString(){
        return "("+real+ "+" +img+ "i)";
    }

}
public class CopyConstructor {
    public static void main(String[] args){
      Complex o1=new Complex();
      System.out.println("Addition of Complex1: "+o1);

      Complex o2=new Complex(40,41);
      System.out.println("Addition of Complex2: "+o2);

      Complex o3=new Complex( o2);
      System.out.println("Addition of Complex3: "+o3);
    }
}
