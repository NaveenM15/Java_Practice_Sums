


    // Anonymous inner class
     interface   Good
    {
        void display() ;
    }
    class Naveen
    {
        void displays()
        {
           Good in=new Good(){
               @Override
               public void display(){
                   System.out.println("Hello World");
               }
           } ;
           in.display();
        }
    }

    public class HelloWorld{
        public static void main(String[] args){
            Naveen io=new Naveen();
            io.displays();

    }
}
