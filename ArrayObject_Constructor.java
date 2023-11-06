
// Array Of Object in Java
import java.util.Scanner;
class Student{
    String name;
    int age;
    public Student(String s,int a){
        name=s;
        age=a;
    }
    Student(String s){
        name=s;
    }
    void name(){
        System.out.print( " "+" All Name : "+name);
    }
    void print(){
        System.out.println("\nName: "+name);
        System.out.println("Age : "+age);
        System.out.println( "*******************************");

    }
}
public class ArrayObject_Constructor {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.println("Enter No. of Students: ");
        int n=in.nextInt();
        Student[] arr=new Student[n];
        String s;
        int a;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student ["+(i+1)+"] Name and Mark");
            System.out.println("Name: ");
            s=in.next();
            System.out.println("Age : ");
            a=in.nextInt();
            arr[i]=new Student(s,a);
            arr[i].print();
        }
        for(int i=0;i<n;i++){
            arr[i].name();
//            arr[i].print();
        }
    }
}
