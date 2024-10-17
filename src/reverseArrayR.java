public class reverseArrayR {
    static void recurReverseArray(int []arr , int l , int r){
        if(l>=r)return ;
        // swap the element at the end
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r]= temp;
        // recur for the remaining element
        // self function colling
        recurReverseArray(arr , 0 , r-1);
    }
    static void reverseA(int []arr){
        int len = arr.length;
        recurReverseArray(arr , 0 , len-1);
    }
    public static void main (String [] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println(" recur Array is=>");
        reverseA(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
