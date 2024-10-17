public class rotateArray {
    static void rotateArrays(int []arr , int d){
        int n = arr.length;
        // repeat the rotation array
        for(int i =0; i<d; i++){
            int first = arr[0];
            for (int j=0; j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
    }
    public static void main (String [] args){
        int []arr = {1,2,3,4,5,6};
        int n = arr.length;
        int d=2;
        System.out.println("right array is =>");
        for(int i= 0; i<n;i++){
            System.out.print(" "+ arr[i]);
        }
        rotateArrays(arr ,d);
        System.out.println();
        System.out.println("Rotate array is =>");
        for(int i= 0; i<n;i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
