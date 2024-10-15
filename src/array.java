

public class array {
    public static void main(String[] args) {
        //declar in array
  //  int [] arr ;
    // allocation  memory  in array
   // arr =new int  [5];
        int [] arr = new int[6];
    // inisilaization in array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        // accessing the elements of the specified array
        // accessing the elements of the specified array
        for (int i = 0; i<arr.length; i++) {
            System.out.println("element at index" + i + " " + arr[i]);
        }
        System.out.println();
        System.out.println("size of Array is "+ arr.length);
    }
}
