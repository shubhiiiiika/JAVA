public class BasicLinearSeach {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6};
        int search= 6;
        //use for loop to read the elements of arr
        for (int i =0;i<arr.length;i++){
            //check the element matches with search use IF CONDITION
            if (arr[i]==search){
                System.out.println("FOUND THE ELEMENT "+search+" at"+i);
                break;
            }

        }

    }
}
