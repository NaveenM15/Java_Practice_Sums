
//INTERFACE IS DEFAULT OF
//   * PUBLIC AND ABSTRACT WHILE CREATING A METHOD
//   * FINAL STATIC WHILE DECLARING A VARIABLE
//   * WE ARE NOT ALLOWED TO USE BODY IN ABSTRACT METHOD
//   * INORDER TO USE BODY WE CAN USE STATIC KEYWORD.

interface Variable{
    int a=10;

      void fun1();

    void fun2();
     static void fun3(){
         System.out.println("I am fun3");
    }
}
interface none extends Variable{
    void fun4();
}
class Final implements none{

    @Override
    public void fun1() {
        System.out.println("FUN-1");
    }

    @Override
    public void fun2() {
        System.out.println("FUN-2");
    }

    @Override
    public void fun4() {
        System.out.println("FUN-4");
    }
}


public class InterfaceMode {
    public static void main(String[] args){
       System.out.println("A : "+Variable.a);
//       System.out.println("Function 3 : "+Variable.fun3());
        Variable.fun3();
         Final in=new Final();
        in.fun1();
        in.fun2();
        in.fun4();

    }
}
