public class Average {
    public static void main(String[] args) {
        int[]marks= {100,200,300};
        int sum=0,average=0;
        for (int i =0;i< marks.length;i++){
            sum+= marks[i];
           // average=sum/ marks.length;
            /* don't do this the statement will get updated ith times
            but ans will be right but wrong approach
             */
        }
        average=sum/ marks.length;
        System.out.println(sum);
        System.out.println("Average marks is : "+average);
    }
}
