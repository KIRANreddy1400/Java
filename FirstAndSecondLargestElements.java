public class FirstAndSecondLargestElements{
    public static void main (String args[]){
    int arr[]={5,99,9,32,27,81};
    int first=arr[0];
    int second=arr[1];
        for (int i=0;i< arr.length;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }else if(second<arr[i] && arr[i]!=first){
                second=arr[i];
            }
        }
     System.out.println("First Largest element: "+first+"\nSecond largest element: "+second);
    }
    
    }
