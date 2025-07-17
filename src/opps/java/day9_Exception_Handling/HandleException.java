package opps.java.day9_Exception_Handling;

import java.util.Arrays;
import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) {


        System.out.println("Program is started...");

        Scanner sc = new Scanner(System.in);

        //Example 1

    /*    System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number is: "+num);

        try {
        System.out.println(100/num);            // ArithmeticException
        }
        catch (ArithmeticException e){
            System.out.println("Invalid input data...");
            System.out.println(e.getMessage());
        }

     */

        //Example 2

    /*    int[] a = new int[5];
        System.out.println("Enter the position(0-4): ");
        int pos = sc.nextInt();

        System.out.println("Enter the value: ");
        int value = sc.nextInt();

        try {
            a[pos] = value;                            //ArrayIndexOutOfBoundsException
        }
        catch (Exception e){
            System.out.println("Invalid input...");
            System.out.println(e.getMessage());
        }
        System.out.println(a[pos]);
//        System.out.println(Arrays.toString(a));        // This statement give you a Exception you have to comment this line

     */


        //Example 3

    /*    String s = "welcome";
        try {
        int i = Integer.parseInt(s);        //NumberFormatException
        System.out.println(i);
        }
        catch (Exception e){
            System.out.println("Invalid string...");
            System.out.println(e.getMessage());

        }

     */

        //Example 4

        String s = "null";
        try {
        System.out.println(s.length());             //NullPointerException
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Program is completed...");
        System.out.println("Program is exited...");



















    }
}
