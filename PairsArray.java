//Topic:- PAIRS IN ARRAYS
//Date:- 17/08/2024 SATURDAY
//Day:- 03
public class PairsArray {
    public static void pairsArray(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                total=total+1;

            }
            System.out.println();
        }
        System.out.println("TOTAL NUMBERS OF SUBARRAYS:-"+total);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pairsArray(arr);
        
    }
    
}
