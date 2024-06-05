import java.util.*;
class fun{
  public void dupli(String s ,StringBuilder sb1){
        char c []=s.toCharArray();
        for(int i=0;i<s.length();i++){
            boolean b=false;
            for(int j=i+1;j<s.length();j++){
                if(c[i]==c[j]){
                    b=true;
                }
            }
            if(!b){
                sb1.append(c[i]);
            }
        
        }
        System.out.println(sb1);
    }
}
public class RemoveDup{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         StringBuilder sb=new StringBuilder();
         fun f1=new fun();
         f1.dupli(str,sb);
         sc.close();


    }}