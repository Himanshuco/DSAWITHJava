//Topic:- ARRAYS CLASS METHODS
//Date:- 08/08/2024 Thursday
//Day:- 01
import java.util.Arrays;
public class Arraysclass {
    //
    public static void main(String[] args) {
        int arr[]={9,6,5,1,7,2,5};
        int size=arr.length;
        int arr2[]=new int[size];
        //BINARY SEARCH
        System.out.print("Search element 5 at index:-");
        System.out.println(Arrays.binarySearch(arr,5));
        //Printing elements
        System.out.print("Printing the arrays1 without sorting");
        System.out.println(Arrays.toString(arr));
        //SORTING
        Arrays.sort(arr);
        //Printing elements
        System.out.print("Printing the arrays1 after sorting");
        System.out.println(Arrays.toString(arr));
        //FILLING ELEMENTS IN A ARRAYS
        Arrays.fill(arr2, 8);
        System.out.print("Printing the arrays2");
        System.out.println(Arrays.toString(arr2));
        //Comparing two arrays
        System.out.print("Comparing the two arrays:- ");
        System.out.println(Arrays.equals(arr,arr2));





    }
    
}
