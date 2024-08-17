//Topic:- SORTING IN ARRAYS
//Date:- 10/08/2024 Saturday
//Day:- 03

public class SortingArrays {
    //PRINT ARRAY
    public static void printArr(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");

        }
    }
    public static void printArrs(int arr2[]){
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");

        }
    }
    //BUBBLE SORT
    public static void bubbleSort(int arr1[]){
        int size=arr1.length-1;
        for(int turn=0;turn<size;turn++){ 
            for(int i=0;i<size-turn;i++){ 
                if(arr1[i]>arr1[i+1]){
                    int temp=arr1[i];
                    arr1[i]=arr1[i+1];
                    arr1[i+1]=temp;
                }
            }
        }

    }
    
    //SELECTION SORT
    public static void selectiononSort(int arr2[]){
        for(int i=0;i<arr2.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[minpos]>arr2[j]){
                    minpos=j;
                }
                
            }
            int temp=arr2[minpos];
            arr2[minpos]=arr2[i];
            arr2[i]=temp;

        }

    }

    public static void main(String[] args) {
        //BUBBLE SORT
        int arr1[]={6,5,4,10,9,2,1};
        bubbleSort(arr1);
        printArr(arr1);
        System.out.println();
        //SELECTION SORT
        int arr2[]={60,50,40,90,20,10};
        selectiononSort(arr2);
        printArrs(arr2);


    

    }
}
