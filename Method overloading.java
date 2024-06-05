class Meth{
    public void add(int a,int b){
        System.out.println("2 result is :"+(a+b));
    }
    public void add(int a,int b, int c){
         System.out.println("3 result is :"+(a+b+c));

    }
    public void add( int a,int b,int c,int d){
        System.out.println("4 result is :"+(a+b+c+d));
    }

}
public class Methov {
    public static void main(String args[]){
        Meth m1=new Meth();
        int w=25,x=25,y=25,z=25;
        m1.add(x,y);
        m1.add(x,y,z);
        m1.add(w,x,y,z);


    }
    

    
}
