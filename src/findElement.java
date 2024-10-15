import java.util.Scanner;
public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the target number");
        int target = sc.nextInt();
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int [] arr = new int [n];
        int len = arr.length;
        System.out.println("enter the array element");
        for (int i =0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false; // false means element not found
        for (int i = 0; i<len; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }
            if (flag == true ){
                System.out.println("element found ");
            }else{
                System.out.println("element not found");
            }
    }
}
