class pen{
    String colour;
    public void fun(){
        System.out.println("Pen is writing");

    }
    public void ink(String colour){
        System.out.println(colour);
    }
}
public class oops1 {
    public static void main(String args[]){
        pen p1=new pen();
      String colour="blue";
      p1.colour="brown";
        pen p2=p1;
        p2.colour="pink";
        p1.ink(p1.colour);
     

       
        
        
    }
    
    
}
