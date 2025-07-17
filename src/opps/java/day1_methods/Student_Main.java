package opps.java.day1_methods;

public class Student_Main {
    public static void main(String[] args) {


// ***********How many ways we can store data into variable


 /*     1) store data using object reference variable
        ------------------------------------
        Student stu1 = new Student();
        stu1.sid=101;
        stu1.sname="Amol";
        stu1.grad='A';
        stu1.printStudentData();
 */

  /*      3) store data using method
-------------------------------------------
        Student stu = new Student();
        stu.setStudentData(101,"Ravi",'A');
        stu.printStudentData();
   */


//        3) store data using constructor
// -----------------------------------------
        Student stu = new Student(101,"Rohit",'B');
        stu.printStudentData();


    }
}
