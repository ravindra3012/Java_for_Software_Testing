package basic.java.arrays;

/*
1) Declare an Array
2) Add values into Array
3) Find size of an Array
4) Read single value from an Array
5) Read multiple values from an Array
*/

import java.util.Arrays;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        int a[]={100,200,300,400,500};

//    *****************************//Find the length of an Array*************************

        System.out.println(a.length);


//     **************************  Read a single value from an Array ********************

        System.out.println(a[3]);


//   *********************************  Reading or printing the values from an Array *************************************************************

//    *********   with normal for loop

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


//    *******    with enhanced for loop

        for (int i : a){
            System.out.println(i);
        }

    }
}
