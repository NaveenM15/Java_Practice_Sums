
// METHOD OVERRIDING IN JAVA
// Overridding - Modify the base Class by Using Derived Class
// If we are using parameterized Constructor in Base class
//     -we have to use [super(a,b)] in derived class
class User {// Base class, Super Class, parent Class
    String name;
    int age;
    User(String s, int a) {
        this.name = s;
        this.age = a;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
    class Programmer extends User {
        String companyName;
        Programmer(String x,int a,String comname) {
            super(x,a);
            this.companyName=comname;
        }
        public void display(){
            System.out.println("Name         : "+name);
            System.out.println("Age         : "+age);
            System.out.println("CompanyName : "+companyName);
        }
    }
public class MethodOverRiding {
    public static void main(String[] args) {
        System.out.println("SuperClass : ");
        User in = new User("Naveen",30);
        in.display();
        System.out.println(" ***************************** ");
        System.out.println("OverRiding Derived Class : ");
        User input=new Programmer("naveen",20,"Google");
        input.display();
        System.out.println(" ***************************** ");
        in.display();
        System.out.println(" ***************************** ");

    }
}
