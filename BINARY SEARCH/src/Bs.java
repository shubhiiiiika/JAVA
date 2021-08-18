public class Bs {
    public static void main(String[] args) {
        int []arr={2,5,6,7,8,9,13};
        //Array should be sorted for binary search
        int search=9;
        int li=0;
        int hi= arr.length-1;
        int mi=( li + hi ) / 2;
        while(li<=hi)// search till condition
        {
            if (arr[mi]==search){
                System.out.println("ELEMENT FOUND AT : "+mi);
                break;// necessary or else it will be an infinite loop
            }
            else if (arr[mi]<search){
                li=mi+1;// when element is greater than middle element
                // search on right side from mi, ignore left side .
            }
            else{
                hi=mi-1; // when element < search , search from left side of mi
            }
            // searching formula
            mi=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("Element not found!");
        }

    }
}
