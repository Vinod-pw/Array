import java.util.Scanner;

public class twoSumArray {
    public static void main (String []args){
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter the target number");
        int sum = sc.nextInt();
        int [] arr = {0,3,1,5,9,2,8};
        int len = arr.length;
        for (int i =0; i<len; i++){
            for (int j =i+1; j<len; j++){
                if (arr[i]+arr[j]== sum ){
                    System.out.println(arr[i]+ " "+ arr[j]);
                }

            }
        }
    }
}
