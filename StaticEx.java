class test{
    static float a;
    static float b;
    static{
         System.out.println("Inside static block");
         a=45.f;b=27.5f;
    }
    static void init(){
        System.out.println("Inside static method");
   }
   {
    int x=24, y=34;
    System.out.println("Inside instance block");

   }
   void show(){
    System.out.println("inside instance method");
}
   test(){
    System.out.println("inside constructor");
   }
   
    

} 
public class StaticEx {
    public static void main (String args[]){
       test t=new test();
       t.show();
       test.init();

       
    }

    
}
