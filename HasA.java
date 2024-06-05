class Os{
    private String name;
    private int size;
    Os(String name,int size){
        this.name=name;
        this.size=size;
    }
    public String get_name(){
        return name;
    }
    public int get_size(){
        return size;
    }
}
class Charger{
    private String brand_name;
    private int voltage;
    Charger(String brand_name,int voltage){
        this.brand_name=brand_name;
        this.voltage=voltage;
    }
    public String get_brand_name(){
        return brand_name;
    }
    public int get_voltage(){
        return voltage;
    }
}
class Mobile{
    Os os=new Os("Parrot os",4);
    void hasA(Charger c){
        System.out.println(c.get_brand_name());
        System.out.println(c.get_voltage());
    }
}

public class HasA{
    public static void main (String args[]){
        Charger c=new Charger("Honour",64);
        Mobile m=new Mobile();
        System.out.println(m.os.get_name());
        System.out.println(m.os.get_size());
        m.hasA(c);
        System.out.println(c.get_brand_name());
        System.out.println(c.get_voltage());
    }
    /*here you can access the charge using charger type reference since it has loose bound relation ship 
    but you cannot access os without using mobile type reference where it has tight bound "has a" relation ship*/

    
}
