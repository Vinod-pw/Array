public class sumArray {
    public static void main (String [] vinod){
        int [] arr = {3,5,2,1,6};
        int len = arr.length;
        sum (arr);
    }
    public static void sum(int[]arr){
        int sum = 0;
        for(int i = 0 ; i<arr.length; i++){
            sum +=arr[i];
            System.out.println("Array sum is "+ sum);
        }
        System.out.println();
    }
}
