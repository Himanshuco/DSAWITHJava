//Topic:- ARRAYS BASIC 
//Date:- 08/08/2024 Thursday
//Day:- 01

import java.util.Scanner;

public class Arrays {
   //Printing arrays in ascending oder:-
    public static void printaArr(int[] arr,int n) {
        for(int i=0;i<n;i++){
            
            System.out.println("ELEMENTS AT "+i+" "+arr[i]);

        }
    }
    ////Printing arrays in descending oder:-
    public static void printdArr(int[] arr,int n) {
        for(int i=n-1;i>=0;i--){
            
            System.out.println("ELEMENTS AT "+i+" "+arr[i]);

        }
    }
    public static void main(String[] args) {
        System.out.println("ARRAYS");
        int arr[]={1,2,3,4,5,6,7,8,9};
        int size=arr.length;
        System.out.println("Ascending order");
        printaArr(arr , size);
        System.out.println("");
        System.out.println("DESCENDING ORDER");
        printdArr(arr , size);
    }
    
}
