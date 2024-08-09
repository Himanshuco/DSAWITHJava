//Topic:- SEARCH IN ARRAYS
//Date:- 09/08/2024 Friday
//Day:- 02

import java.security.Key;

public class SearchArrays {
    //Linear Search
    public static int linearSearch(int arr[], int key){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={5,9,8,4,6,2,3,10};
        int key=8;
        int index =linearSearch(arr,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("ELEMENT "+key+" FOUND AT INDEX "+index);
        }

    }
    
}
