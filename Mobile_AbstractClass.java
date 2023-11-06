
// PROGRAM WITH DIFFERENT TYPES OF MOBILE COMPANY USING ABSTRACT CLASS

 abstract class Mobile{
    void voice(){
        System.out.println("We provide clear Voice.");
    }
    abstract void camera();
    abstract void touch();
    abstract void charge();
}
class Nokia extends Mobile {
    @Override
    void camera(){
        System.out.println("30Px Camera");
    }
    @Override
    void touch(){
        System.out.println("3D TouchPad");
    }
    @Override
    void charge(){
        System.out.println("1000MAh Capacity Battery");
    }
}
class Samsung extends Mobile{
    @Override
    void camera(){
        System.out.println("40Px Camera");
    }
    @Override
    void touch(){
        System.out.println("Gorilla TouchPad");
    }
    @Override
    void charge(){
        System.out.println("6000MAh Capacity Battery");
    }
}
class Redmi extends Mobile{
    @Override
    void camera(){
        System.out.println("50Px Camera");
    }
    @Override
    void touch(){
        System.out.println("Shine TouchPad");
    }
    @Override
    void charge(){
        System.out.println("5000MAh Capacity Battery");
    }
}
class Vivo extends Mobile{
    @Override
    void camera(){
        System.out.println("64Px Camera");
    }
    @Override
    void touch(){
        System.out.println("Glass TouchPad");
    }
    @Override
    void charge(){
        System.out.println("8000MAh Capacity Battery");
    }
}
public class Mobile_AbstractClass {
    public static void main(String[] args){
        Mobile o1=new Nokia();
        System.out.println("Brand Nokia📳📳📳");
        o1.voice();
        o1.camera();
        o1.touch();
        o1.charge();
        System.out.println("-----------------------------------------------------------");
        Mobile o2=new Samsung();
        System.out.println("Brand Samsung📳📳📳");
        o2.voice();
        o2.camera();
        o2.touch();
        o2.charge();
        System.out.println("-----------------------------------------------------------");
        Mobile o3=new Redmi();
        System.out.println("Brand Redmi📳📳📳");
        o3.voice();
        o3.camera();
        o3.touch();
        o3.charge();
        System.out.println("-----------------------------------------------------------");
        Mobile o4=new Vivo();
        System.out.println("Brand Vivo📳📳📳");
        o4.voice();
        o4.camera();
        o4.touch();
        o4.charge();
        System.out.println("-----------------------------------------------------------");

    }
}
