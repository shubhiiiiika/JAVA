public class LsTemp {
    // A java code to check what if the element is not present in the array
    //declare and initialise an array
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8};
        int search = 6;
        int temp = 0;
        for(int element : array){
            if(element==search){
                System.out.println("found");
                temp++;
                break;// write break here not in for loop statement it wont run further
            }
         }
        if(temp==0){
            System.out.println("ELEMENT is not found 404!");
        }

    }
}
