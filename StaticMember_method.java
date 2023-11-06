
// PROGRAM TO WRITE POWER OF A NUMBER************************
//  *WHEN WE USE STATIC WORD IN OUTSIDE THE FUNCTION
//    WE HAVE TO ACCESS THE WITHOUT CREATING AN INSTANCE
//    BY USING CLASS NAME OF STATIC
class Maths{
    public static int power(int base,int  power){
        int result=1;
        for(int i=1;i<=power;i++)
        {
            result*=base;
        }
        return result;
    }
}
public class StaticMember_method {
    public static void main(String[] args)
    {

        System.out.println("RESULT = "+Maths.power(2,3));
    }

}
