import java.util.*;
public class BinaryClass {

    public static void main(String[] args) {
        int[]arr={12,24,36,48,60,72};
        int key = 112;
        int result= Arrays.binarySearch(arr,key);
        if(result<0){
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Item found at: "+result);
        }


    }
}
