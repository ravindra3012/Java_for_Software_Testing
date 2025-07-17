package basic.java.arrays;

import java.util.Arrays;

public class SortingElementinArray {
    public static void main(String[] args) {

        int[] arr={100,200,800,400,300,900};

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));





    }
}
