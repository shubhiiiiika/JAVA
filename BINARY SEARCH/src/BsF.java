public class BsF {
    /*
      Binary search using functions
     same code as binary search
    */
    static void binarySearch(int[]arr,int first,int last,int search){
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]==search){
                System.out.println("Element found at : "+mid);
                break;
            }
            else if (arr[mid]<search){
                first= mid+1;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if (first>last){
            System.out.println("element not found!");
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int last = arr.length-1;
        int search = 5;
        binarySearch(arr,0,last,search);// calling the function

    }
}
