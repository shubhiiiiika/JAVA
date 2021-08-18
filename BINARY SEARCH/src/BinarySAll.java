import java.util.*;

public class BinarySAll {
    public static void main(String[] args) {
        // everything from user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[]arr= new int[n];
        System.out.println("ENTER the elements of the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //printing the array
        for (int element:arr){
            System.out.print(element+"\t");
        }
        System.out.println();
        System.out.println("Enter the Item you want to search: ");
        int search= sc.nextInt();
//        int result= Arrays.binarySearch(arr,search);
//        //Displaying the O/P
//        if(result<0){
//            System.out.println("element not found!");
//        }
//        else{
//            System.out.println("Item found at: "+result);
//        }
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        while(li<=hi){
            if(arr[mi]==search){
                System.out.println("found at: "+mi);
                break;// or else will keep printing till condition is false
            }
            else if(arr[mi]<search){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            //formula for searching:
            mi=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("ITEM NOT FOUND!");
        }

    }


}
