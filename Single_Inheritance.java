
// SINGLE INHERITANCE IN JAVA
// INORDER TO ACCESS THE INHERITANCE WE HAVE TO USE
// -subclass extends base class
// SINGLE INHERITANCE [ ONE BASE CLASS, ONE DERIVED CLASS]
class Father{// Base class, Parent class,
    public void house(){
        System.out.println("Father Buy New 3BHK House.");
    }
}
class Son extends Father {// child class, derived class.
    void car(){
        System.out.print("Son Buy New BMW Car.");
    }
}

public class Single_Inheritance {
    public static void main(String[] args){
        System.out.println("Father's Property");
        Father o1=new Father();
        o1.house();
        System.out.println("Son's Property");
        Son o2=new Son();
        o2.car();
        System.out.println(" Inhertance");
        o2.car();
        o2.house();
    }
}
