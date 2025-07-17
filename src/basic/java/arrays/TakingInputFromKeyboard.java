package basic.java.arrays;

import java.util.Scanner;

public class TakingInputFromKeyboard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("Your Number is : "+num);

        System.out.println("Enter Decimal Number");
        double num1 = sc.nextDouble();
        System.out.println("Your Decimal Number is : "+num1);

        System.out.println("Enter Your city : ");
        String city = sc.next();
        System.out.println("Your city name is : "+city);

    }
}
