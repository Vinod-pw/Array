public class MultidimensionalArray {
    public static void main (String [] args){
        //int [][] arr = new int[3][3];
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        for (int i =0; i<n; i++){
            for (int j =0; j<m;j++) {
                System.out.print( " " + arr[i][j]);
            }
        }
        System.out.println();
        // length of rows
        System.out.println("length of rows  is => "+arr.length);
        // length of column
        System.out.println("length of column is =>"+arr[0].length);
    }

}
