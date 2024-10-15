import com.sun.jdi.IntegerValue;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //SIMPLE ARRAYLIST REPRESENT
//        ArrayList <Integer> arr = new ArrayList<>(7);
//        arr.add(0,10);
//        arr.add(1,20);
//        arr.add(2,30);
//        arr.add(3,40);
//        arr.add(4,50);
//        arr.add(5,60);
//        arr.set(2,300);// modification to change
//        arr.add(6,600);
//       // System.out.println(arr.get(3));
//        for(int i=0; i< arr.size();i++){
//            System.out.print(arr.get(i)+ " ");
//        }
       // ARRAY LIST  KUCH ALAG TARIKE SE
        ArrayList < Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(10);
        System.out.println(list+ " "+ list.size());
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list + " " + list.size());
        list.remove(3);
        System.out.println(list);
    }
}
