//Topic:- SEARCH IN ARRAYS
//Date:- 09/08/2024 Friday
//Day:- 02

import java.security.Key;
import java.util.Arrays;

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
    //Binary Search
    public static int binarySrch(int arr2[],  int key2){
        int start = 0;
        int end = arr2.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr2[mid]==key2){
                return mid;
            }
            if(arr2[mid]<key2){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={5,9,8,4,6,2,3,10};
        int arr2[]={5,9,8,4,6,2,3,10};
        int key=8;
        int key2=6;
        //LINEAR SEARCH
        int index =linearSearch(arr,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("ELEMENT "+key+" FOUND AT INDEX "+index);
        }
        //BINARY SEARCH
        Arrays.sort(arr2);
        int index2=binarySrch(arr2, key2);
        if(index2==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("ELEMENT "+key2+" FOUND AT INDEX "+index2);
        }

    }
    
}
