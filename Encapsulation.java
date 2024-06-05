class bank{
    private int accont_number;
    private int balance;
    private String Holder;
    bank(){
        System.out.println("This effect");
        this.accont_number=11;
        this.balance=220000000;
        this.Holder="JONNA";
        System.out.println(accont_number+"  "+balance +"  "+Holder);
    }
    bank(int a,int b,String h){
        this();
      this.accont_number=a;
      this.balance=b;
      this.Holder=h;
    }
    public int get_balance(){
        return balance;

    }
    public int get_accont(){

    return accont_number;
}
public String get_holder(){
    return Holder;
}
}
class Encapsulation{
    public static void main(String args[]){
        bank b1=new bank(23714,5000,"KIRAN");
        String name=b1.get_holder();
        int balance=b1.get_balance();
        int acnt=b1.get_accont();
        System.out.println("Holder name: "+name+"\naccount_number: "+acnt+"\nbalance: "+balance);

    }

    
}
