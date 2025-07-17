package basic.java.arrays;

import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {

//        char[] c = {'v','a','c','x','b'};

          String[] c = {"ravi","akshay","sagar","vaibha"};


        System.out.println("Before sorting "+ Arrays.toString(c));

        Arrays.sort(c);

        System.out.println("After sorting "+ Arrays.toString(c));
    }
}
