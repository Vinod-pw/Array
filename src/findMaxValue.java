public class findMaxValue {
    public static void main (String [] args){
        int [] arr = { -10,44,55,44,88,1,3,8};
        int len = arr.length;
        // first  method
//       int max = arr[0];
//        for (int i=0; i<len; i++){
//            if (arr[i]>max)
//                max = arr[i];
//        }
//        System.out.println("max num is this =>"+max);
        // Second method
        int mx = Integer.MAX_VALUE;
        for (int i=0; i<len; i++){
            mx = Math.max(mx,arr[i]);
        }
        System.out.println("max num is this =>"+mx);
    }
}
