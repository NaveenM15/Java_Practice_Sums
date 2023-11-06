
//  Final Variable in Java
//  It is implements by using final keyword before datatype.
//  Generally final variable are denoted as Capital Word.
//  It's like constant (unchanged).
//  we can assign value directly or by using Constructor.


class FinalTest{
    final int MIN=1;
    final int NORMAL;
    final int MAX;
    public FinalTest(int n,int m){
        NORMAL=n;
        MAX=m;
    }
    void display(){
        System.out.println("\nMIN     : "+MIN);
        System.out.println("NORMAL  : "+NORMAL);
        System.out.println("MAX     : "+MAX);
    }
}
public class Final_Variable_1 {
    public static void main(String[] args){
         FinalTest in=new FinalTest(10,100);
         in.display();
         System.out.println("****************");

    }
}
