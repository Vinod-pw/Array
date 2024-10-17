public class reverseArray {
    // function for reversing array
    static void ReverseArray(int []arr){
        int n = arr.length;
        // temp0ray array reverse element in reverse order
        int []temp = new int[n];
        // copy array from original array to temp array in reverse order
        for (int i =0;i<n;i++){
            temp[i]= arr[n-i-1];

        }
        // copy element back to original Array
        for (int i =0; i<n; i++){
            arr[i]= temp[i];
        }
    }
    public static void main (String [] args){
        int  [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        // for printing original array
        System.out.println("these is original array");
        for(int i =0; i<n; i++) {
            System.out.print(arr[i] + " ");

        }
            ReverseArray(arr);
        System.out.println();
        System.out.println("these is reverse array");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");

        }
    }
}
