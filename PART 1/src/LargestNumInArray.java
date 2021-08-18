public class LargestNumInArray {
    public static void main(String[] args) {

        int[]arr={54,65,76,54,23,88,99};
        int largest=arr[0];
        for (int element:arr)// reading each element of the array
        {
            if (largest<element){
                largest=element;
            }
        }
        System.out.println("largest element is: "+largest);
    }
}
