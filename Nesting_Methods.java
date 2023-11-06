
// Nesting Methods in Java
// A Method Written In Another Methods
class Demo{
    int m,n;
    Demo(int x,int y){
        m=x;
        n=y;
    }
    int Greater(){
        if(m>n)
            return m;
        else
            return n;
    }
    int display(){
        int n=Greater();
        return n;

    }
}
public class Nesting_Methods {
    public static void main(String[] args)
    {
       Demo in=new Demo(5,10);
       System.out.println("Greater No. is :"+in.Greater());
       System.out.println("Display Function is :"+in.display());
    }
}
