import java.util.*;
class dim1{
    void fun1() throws Exception{
        System.out.println("connection 2 is established");
        Scanner Sc = new Scanner(System.in);
        try{
            System.out.println("Enter numerator");
            int a=Sc.nextInt();
            System.out.println("Enter denominator");
            int b=Sc.nextInt();
            int c=a/b;
            System.out.println("Solution is "+c);}
        catch(Exception e){
            System.out.println("Enter a valid input");
            throw e;
        }
        finally{
            System.out.println("connection 2 is terminated");
        }
}
}
class dim2{
    public static void main(String args[]){
        System.out.println("Connection 1 is established");
       
        try{
            dim1 d1=new dim1();
            d1.fun1();
        }
        catch(Exception e){
            System.out.println("There is something wrong in caluclator connected to server 365");
        }
    }
}