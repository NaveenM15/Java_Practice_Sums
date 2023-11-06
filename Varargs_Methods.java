
// METHOD WITH VARARGS IN JAVA

  public class Varargs_Methods{
    public  static  void getNames(String... name){
       for(String a:name){
           System.out.println(a);
       }
    }
    public static void main(String[] args){
        getNames("Naveen","hi","a","b","c");
    }
}
