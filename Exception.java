import java.util.Scanner;
class demo1{

void fun1(){
    System.out.println("connection 4 is established");
   System.out.println("Enter numerator");
    Scanner Sc =new Scanner(System.in);
    int a=Sc.nextInt();
    System.out.println("Enter denominator");
    int b=Sc.nextInt();
    float c=a/b;
    System.out.println(c);
    System.out.println("Connection 4 is terminated");
}
}

class demo2{
 
   void fun2(){
    System.out.println("connection 3 is established");
    demo1 d1=new demo1();
    d1.fun1();
    System.out.println("Connection 3 is terminated");
   }
   

}
class demo3{

void fun3(){
    System.out.println("Connection 2 is established");
    demo2 d2=new demo2();
    d2.fun2();
 
    System.out.println("connection 2 is terminated");
}

}
public class Exception{
    public static void main(String args[]){
        System.out.println("Connection 1 is established");
        try{demo3 d3 =new demo3();
        d3.fun3();}
        catch( ArithmeticException e){
            System.out.println("Enter valid input");}
        System.out.println("Connection 1 is terminated");

    }
}
