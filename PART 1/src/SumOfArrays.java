public class SumOfArrays {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int sum =0;
        System.out.println("Using for each loop:");
        for (int element:arr){
            sum+= element;
        }
        System.out.println(sum);
        System.out.println("using for loop:");
        int total=0;
        for (int i =0;i<arr.length;i++)
        /* why <arr.length?; as index starts from 0,
        the check statement will run till n-1th element if
        <= is given the loop will check for nth element which doesn't exist
        gives error out of index bound.
         */
        {
            total+=arr[i];
        }
        System.out.println(total);
    }

}
