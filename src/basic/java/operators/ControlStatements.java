package basic.java.operators;

public class ControlStatements {
    public static void main(String[] args) {

//        Control Statement
//        1) conditional statement
//        2) looping / iterative statements
//        3) jumping statements


        //   *******     1) conditional statement      **********

//        1) if
//        2) if else
//        3) nested if else
//        4) switch case

//        int age =11;
//
//        if (age >=18){
//            System.out.println("The person is eligible for voting");
//        }
//        else {
//            System.out.println("The person is NOT eligible for voting");
//        }
//


//      ******************  Q) Check the number is positive, negative or zero    *****************

//        int a = -55;
//
//        if (a>0){
//            System.out.println("The number is POSITIVE");
//        }
//        else if (a<0) {
//            System.out.println("The number is NEGATIVE");
//        }
//        else{
//            System.out.println("The number is ZERO");
//        }

//        *************************************************************************************


//        ******************  Q) Find the largest number ***********************************

        int a=10, b=20, c=30;

        if (a>b && a>c){
            System.out.println("a is largest number");
        }
        else if (b>a && b>c) {
            System.out.println("b is largest number");

        }
        else{
            System.out.println("c is largest number");
        }




    }
}
