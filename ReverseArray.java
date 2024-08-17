//Topic:- REVERSE IN ARRAYS
//Date:- 17/08/2024 Saturday
//Day:- 03
public class ReverseArray {
    public static void reversearr(int arr[]){
        int j=arr.length-1;
        int n=arr.length;
        for(int i=0;i<n/2;i++){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;


        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5};
        reversearr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
