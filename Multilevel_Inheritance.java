
// MULTILEVEL INHERITANCE IN JAVA
// ONE BASE CLASS, TWO DERIVED CLASS
class GrandFather{
  public void land(){
      System.out.println("Buy an land.");
  }
}
class Father1 extends GrandFather{
    public void house(){
        System.out.println("Buy an House.");
    }
}
class Son1 extends Father1{
    public void car(){
        System.out.println("Buy an Audi Car.");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args){
        Son1 in=new Son1();
        in.land();
        in.house();
        in.car();
    }
}
