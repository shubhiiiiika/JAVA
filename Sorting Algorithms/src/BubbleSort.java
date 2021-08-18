public class BubbleSort {
    //A java program to sort the elements in the array using bubble sort
    public static void main(String[] args) {
        /* 1. declare and initialise an unsorted array
           2. declare n as size of the array
           3. Use first FOR loop for going thru the given array ith loop
              second For loop for sorting j th loop
              DO THE REQUIRED OPTIMIZATION
           4. Print the sorted array
         */
        int []arr={43,12,54,24,77,9};
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            boolean sorted = true; // first opti is array is already sorted
            for (int j =0;j<n-1-i;j++) // second opti don't sort the last elements as they are already sorted
            {
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        for (int element: arr){
            System.out.print(element+"\t");
        }

    }
}
