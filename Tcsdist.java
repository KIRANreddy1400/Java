import java.util.Scanner;
public class Tcsdist {
    public static void main (String args[]){
        System.out.println("enter n");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=1;
        int i=0;
        int j=0;
        int d=10;
        for(int k=1;k<=n;k++){
            switch(m){
                case 1:
                i=i+d;
                d=d+10;
                m=2;
                break;

                case 2:
                j=j+d;
                d=d+10;
                m=3;
                break;

                case 3:
                i=i-d;
                d=d+10;
                m=4;
                break;

                case 4:
                j=j-d;
                d=d+10;
                m=5;
                break;

                case 5:
                i=i+50;
                d=d+10;
                m=1;
                break;




            }
        }
        System.out.println("("+i+","+j+")");

    }
    
}
