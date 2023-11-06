import java.util.Scanner;
import java.util.Arrays;

class GoodMor{
    String name;
    int age;
    public GoodMor(String s, int a){
        name=s;
        age=a;
    }
//    public void name()
//    {
//        System.out.println("All the name of the boys: "+name);
//    }
//    public void  age()
//    {
//        System.out.println("All the name of the boys: "+name);
//    }
    public void Print()
    {
        System.out.println("All the name of the boys: "+name);
        System.out.println("All the name of the Ages: "+age);
        System.out.println("Combination : "+name+":"+age);
        System.out.println("_____________________________________________--");

    }
}
public class None
{
        public static void main(String[] args)
        {
            Scanner io=new Scanner(System.in);
            System.out.println("Enter No. of Student: ");
            int n=io.nextInt();
            GoodMor[] in=new GoodMor[n];
            String nam;
            int ag;
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter Name :");
                nam=io.nextLine();
                io.nextLine();
                System.out.println("Enter Age  :");
                ag=io.nextInt();

                in[i]= new GoodMor(nam,ag);
                  in[i].Print();
            }

        }
}

