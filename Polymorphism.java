class plane{
    void takeoff(){
        System.out.println("Plane is takig off \n \n");
    }
    void fly(){
        System.out.println("Plane is Flying \n \n");
    }
  void land(){
    System.out.println("Plane is landing \n \n ");

  }
}
class cargoplane extends plane {
    void takeoff(){
        System.out.println("cargoplane is taking flying \n \n");
    }
    void fly(){
        System.out.println("Cargo plane is flying at low height \n \n");
    }
    void carrycargo(){
        System.out.println("Cargoplane is carring goods \n \n");
    }
    void land(){
        System.out.println("cargo plane is landing \n \n");
    }
}
class passengerplane extends plane{
    void takeoff(){
        System.out.println("passenger plane is takingoff \n \n");

    }
    void fly(){
        System.out.println("Passenger plane is flying at medium height \n \n");
    }
    void carrypassenger(){
        System.out.println("passenger plane is carrying passengers \n \n");

    }
    void land(){
        System.out.println("Passenger plane is \n \n");
    }

}
class fighterplane extends plane{
    void takeoff(){
        System.out.println("Fighter plane is taking off \n \n");
            }
    void fly(){
        System.out.println("Fighter plane is flying at great  \n \n");
    }
    void carryweapons(){
        System.out.println("Fighter plane is carring weapons \n \n");
    } 
    void land(){
        System.out.println("Fighter plane is landing \n \n");
    }
}
/*class Airport{
    void permit(plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
    }

}*/
public class Polymorphism
 {
    public static void main(String args[]){
        plane p= new plane();
        p.takeoff();
        p.fly();
        p.land();
        cargoplane cp=new cargoplane();
        plane p1=cp;
        p1.takeoff();
        p1.fly();
        p1.land();
        ((cargoplane)p1).carrycargo();
        fighterplane fp=new fighterplane();
        p1=fp;
        p1.takeoff();
        p1.fly();
        p1.land();
        ((fighterplane)p1).carryweapons();//downcasting(to tightcoupling) for accessing specialized methods
        passengerplane pp=new passengerplane();
        p1 =pp;
        p1.takeoff();
        p1.fly();
        p1.land();
        ((passengerplane)p1).carrypassenger();
       
        
    }

    
}
