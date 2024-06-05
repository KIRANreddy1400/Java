class plane{
    public void takeoff(){
        System.out.println("plane is taking off");

    }
   public void fly(){
    System.out.println("plane is flying");
   } 
   public void land(){
    System.out.println("plane is landing");
   }
}
class cargoplane extends plane{
    public void fly(){
        System.out.println("cargo plane is flying at low height");
    }
    public void carrycargo(){
        System.out.println("cargo plane is carrying goods");

    }
}
class passengerplane extends plane{
    public void fly(){
    System.out.println("Passenger plane is flying at Low height");
    }
    public void carrypassenger(){
        System.out.println("Passenger plane is flying at Medium height");
    }
}
class fighterplane extends plane {
    public void fly(){
        System.out.println("Fighter plane is flying at great height");
    }
    public void carryweapons(){
        System.out.println("Fighter plane is carrying weapons");
    }
}
class parent {
    public plane fun(){
        System.out.println("Parent fun()");
        plane p=new plane();
        return p;
    }
}
class child extends parent{
    public cargoplane fun(){
        System.out.println("Inside child");
        cargoplane cp=new cargoplane();
        return cp;
    }
}
    public class Inheritance{
    public static void main(String args[]){
        parent po=new parent();
        child c =new child();
        plane plo=po.fun();
        plane ref;
        plo.fly();
        plo.takeoff();
        plo.land();
        plane cpo=c.fun();
        cpo.fly();
        cpo.land();
        cpo.takeoff();
        plane p=new plane();
        plane b;
        b=new cargoplane();
        passengerplane pp=new passengerplane();
        fighterplane fp =new fighterplane();
       
        b.takeoff();
        pp.takeoff();
        fp.takeoff();
    b.fly();
        pp.fly();
        fp.fly();
    
        pp.carrypassenger();
        fp.carryweapons();


    }
}