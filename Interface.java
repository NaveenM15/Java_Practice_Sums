
//INTERFACE , TO ACHVIEW MULTIPLE POLYMORPHISM IN JAVA
interface  Animals{
    public abstract void sound();
    public abstract void color();
}
class Cat implements Animals{
    @Override
    public void sound(){
        System.out.println("Sound of Cat");
    }
    @Override
    public void color(){
        System.out.println("Color of Cat");
    }
}
class Dog implements Animals{
    @Override
    public void sound(){
        System.out.println("Sound of Dog");
    }
    @Override
    public void color(){
        System.out.println("Color of Dog");
    }
}

public class Interface {
    public static void main(String[] args){
        Animals in=new Dog();
        in.sound();
        in.color();
    }
}
