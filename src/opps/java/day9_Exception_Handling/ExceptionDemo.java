package opps.java.day9_Exception_Handling;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("Program is started...");

        Scanner sc = new Scanner(System.in);

      //Example 1
    /*    System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number is: "+num);

        System.out.println(100/num);            // ArithmeticException

     */

      //Example 2

    /*    int a[] = new int[5];
        System.out.println("Enter the position(0-4): ");
        int pos = sc.nextInt();

        System.out.println("Enter the value: ");
        int value = sc.nextInt();

        a[pos]=value;                            //ArrayIndexOutOfBoundsException
        System.out.println(a[pos]);
        System.out.println(Arrays.toString(a));

     */


        //Example 3
    /*
        String s = "welcome";
        int i = Integer.parseInt(s);        //NumberFormatException
        System.out.println(i);

     */


        //Example 4

        String s = null;
        System.out.println(s.length());             //NullPointerException



        System.out.println("Program is completed...");
        System.out.println("Program is exited...");


    }
}
