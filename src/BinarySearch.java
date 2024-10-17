public class BinarySearch {
    static int binarySearch(int []arr , int x){
        int low =0;
        int high = arr.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            // check x is present in mid
            if(arr[mid]==x)
                return mid;
            // check x is greater than mid
            if (arr[mid]<x)
                low = mid+1;
            // check x is smaller the mid
           // if (arr[mid]>x)
            else
                high = mid-1;
        }
        //if we reach here than the element not present
        return -1;
    }
    public static void main(String[] args) {
       BinarySearch vinod =  new BinarySearch();
        int [] arr = {2,3,4,10,40,50,60};
        int n = arr.length;
        int x = 50;
        int result = vinod.binarySearch(arr ,x);
        if (result ==-1)
            System.out.println("Element is not present");
        else
            System.out.println("element is present "+ result);
    }

}
