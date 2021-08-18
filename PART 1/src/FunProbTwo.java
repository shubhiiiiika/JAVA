public class FunProbTwo {
    public static void main(String[] args) {
        char[] arr= new char[15];
        System.out.println(arr[15]);
        /* gives ERROR: ArrayIndexOutOfBoundsException
        extends IndexOutOfBoundsException
        as arrays starts from 0, it will store 0-14(n-1th)=15 bt here the cmnd
        is checking for ..
        15TH(nth)which wasn't declared, hence the error OUT OF BOUNDS FOR LENGTH 15!
         */
    }
}
