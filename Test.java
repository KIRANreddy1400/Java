public class Test{
    public static void main (String args[]){
    int arr[]={5,7,9,11,13,27,81,81,91,91};
    int first=arr[0];
    int second=arr[1];
        for (int i=0;i< arr.length;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }
    


        }
        System.out.println(first);
        System.out.println(second);

    }
    
    }

