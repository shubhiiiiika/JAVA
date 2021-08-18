public class SelectionSort {
    public static void main(String[] args) {
        // A java Program to Sort the elements in a given array using SELECTION SORT
        /* 1) Declare and Initialise an Unsorted array
        *  2) assign n as the size of the array
        *  3) use 1st for loop for going thru the elements of the array ith
        *  -> apply checkpoint : assign minimumIndex to i;
        *  4) use 2nd for loop for swapping the smallest index in the given array
        *  -> use if condition checking minindex< j ; update j = minimum Index
        *  -> j loop starts after ith iteration therefore j=i;
        *  -> close the loop jth
        *  write the Swapping Condition in ith loop same as bubble sort but
        * now, a[j+1]=a[i] and a[j]=a[minIndex]
        * 5) print the sorted array.
        *  */
        int[]a={54,3,26,87,1,96,0,23};
        int n = a.length;
        for(int i =0;i<n-1;i++){
            int minIndex=i;
            for (int j=i;j<n-1;j++){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
        for (int e:a) {
            System.out.print(e+"\t");
        }
    }
}
