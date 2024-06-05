class Demoo{
   public  static Demoo d=new Demoo();
    void fun(){
        System.out.println("inside Fun");

    }
    private Demoo(){

    }
}
public class Singleton {
    public static void main (String args[]){
        Demoo.d.fun();
    }
    
}
