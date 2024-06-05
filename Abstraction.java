abstract class plane{
    abstract void fly();
    abstract void takeoff();
    abstract void land();
    plane(){
        System.out.println("Inside abstract class");
    }
}
class Fighter_plane extends plane{
    Fighter_plane(){
        
    }
    void fly(){
        System.out.println("Fighter plane is flying at great height");
    }
    void takeoff(){
        System.out.println("Fighter plane is taking offf on long runway");
    }
    void land(){
        System.out.println("fighter plane is landing");
    }

}
public class Abstraction{
    public static void main(String args[]){
    Fighter_plane fp=new Fighter_plane();
    fp.fly();
    fp.takeoff();
    fp.land();
    }
    
}
