import java.util.Scanner;
public class findElement {
    public static int search(int []arr , int n, int target){
        for (int i=0; i<n; i++){
            if (arr[i]== target)
                return i; // sout(i for print index) and sout(arr[i] for print element
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the target number");
        int target = sc.nextInt();
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("please Enter the Array");
        int [] arr = new int [n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // function call
        int res = search(arr,arr.length, target);
        if (res == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present" + " "+res);

//        int [] arr = new int [n];
//        int len = arr.length;
//        System.out.println("enter the array element");
//        for (int i =0; i<len; i++){
//            arr[i] = sc.nextInt();
//        }
//        boolean flag = false; // false means element not found
//        for (int i = 0; i<len; i++) {
//            if (arr[i] == target) {
//                flag = true;
//                break;
//            }
//        }
//            if (flag == true ){
//                System.out.println("element found ");
//            }else{
//                System.out.println("element not found");
//            }
    }
}
