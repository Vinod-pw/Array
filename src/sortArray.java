import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int [] arr = {5,8,30,99 ,10, 34 ,25};
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0;i<len;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
