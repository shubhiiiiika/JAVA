import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the length of the array: ");
        int[]arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ARRAY FULL");
        for (int element: arr){
            System.out.println(element);
        }
    }
}
