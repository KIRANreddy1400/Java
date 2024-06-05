import java.util.*;
class dim1{
    void fun1() throws ArithmeticException {
        System.out.println("connection 7 is established");
        Scanner Sc = new Scanner(System.in);
      
            System.out.println("Enter numerator");
            int a=Sc.nextInt();
            System.out.println("Enter denominator");
            int b=Sc.nextInt();
            int c=a/b;
            System.out.println("Solution is "+c);
            Sc.close();
        
        }
}

class Ducking{
    public static void main(String args[]){
        System.out.println("Connection 1 is established");
       
        try{
            dim1 d1=new dim1();
            d1.fun1();
        }
        catch(ArithmeticException e){
            System.out.println("There is something wrong in caluclator connected to server 365");
        }
    }
}