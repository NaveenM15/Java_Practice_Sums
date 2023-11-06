
// SINGLETON IN JAVA
// It is used to create only one class


class Single{

      //  Single(){}  -- DEFAULT CONSTRUCTOR.
        static Single obj=null;
        private Single(){}
    public static Single getelement(){
        if(obj==null){
            obj=new Single();
        }
        return obj;
    }
    void display(){
            System.out.println("\nDisplay of Single Method..");
    }

}
public class SingleTon_Class_1 {
    public static void main(String[] args){
//       Single in=new Single();
        Single in=Single.getelement();
        in.display();

    }
}
