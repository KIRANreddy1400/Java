class du{
    int a;
    int b;

}
class dup{
    public void prac(du obj){
        obj.a=97;
        obj.b=98;

      
    }
}
public class Init {
    public static void main(String args[])
    {
    du d1=new du();
    dup d2=new dup();
    d1.a=11;
    d1.b=12;
    System.out.println(d1.a+" "+ d1.b);
    du d3=d1;
    d2.prac(d3);
    System.out.println(d1.a+"  "+d1.b);
    }

    
}
