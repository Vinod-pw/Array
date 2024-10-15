class Student{
    int roll_no;
    String name;
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name  = name ;
    }

}
public class studentDetails {
    public static void main(String[] args) {
        // declares an array of Student
       //Student[] arr;
        //allocating memory for 5 student array
       Student [] arr = new Student[5];
        // initialize the  elements of the array
        arr[0] = new Student(10, "vinod");
        arr[1] = new Student(20, "santosh");
        arr[2] = new Student(30, "ravi");
        arr[3] = new Student(40, "karan");
        arr[4] = new Student(50, "prashant");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" student roll_no is =>" +" "+ arr[i].roll_no +" "+ "Student name is =>" + arr[i].name);
        }

    }
}