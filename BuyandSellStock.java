import java.util.*;
// Topic:- BUY AND SELL STOCK
// Date:- 17/08/2024 Saturday
// Day:- 03
public class BuyandSellStock {
    public static int buyandSell(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int index = 0;

        // BUY
        for(int j = index; j < arr.length; j++){
            if(smallest > arr[j]){
                smallest = arr[j];
                index = j;
            }
        }

        // SELL
        for(int i = index; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        // Check for no profit
        if(largest <= smallest) {
            return 0;
        }

        System.out.println("PROFIT IS " + (largest - smallest));
        return largest - smallest;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        //NO PROFIT
        //int arr[] = {7,6,4,3,2,1};
        
        int profit = buyandSell(arr);

        // If there was no profit, handle it here
        if(profit == 0) {
            System.out.println("NO PROFIT POSSIBLE");
        }
    }
}