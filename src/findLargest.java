public class findLargest {
    static void print3Largest(int []arr , int arr_size){
        int i ,first ,second , third;
        // there should we at least element
        if (arr_size<3){
            System.out.println("invalid input");
            return ;
        }
        third = first= second = Integer.MIN_VALUE;
        for (i=0;i<arr_size;i++){
            // if current element is grater than first
            if (arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
              /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] > second){
                third = second;
                second = arr[i];
            }
          else if (arr[i] > third){
              third = arr[i];
            }

        }
        System.out.println(" three largest element are=> "+ first +" "+ second +" "+ third);
    }
    // drive program to the above function
    public static void main(String[] args) {
        int [] arr = {20,45,33,24,67,89,90,200};
        int len = arr.length;
        print3Largest(arr ,len);

    }
}
