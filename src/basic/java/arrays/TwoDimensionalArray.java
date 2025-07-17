package basic.java.arrays;
/*
1) Declare an Array
2) Add values into Array
3) Find size of an Array
4) Read single value from an Array
5) Read multiple values from an Array
*/

public class TwoDimensionalArray {

    public static void main(String[] args) {

//        Declaring an Array

//        Approach 1

//        int a [][]=new[no of rows][no of column];
//          int a[][]=new int[3][2];
//          int[][] a =new int[3][2];
//          int[]a[] =new int[3][2];

//        a[0][0]=100;
//        a[0][1]=200;
//
//        a[1][0]=300;
//        a[1][1]=400;
//
//        a[2][0]=500;
//        a[2][1]=600;

//        Approach 2

        int b[][]= {
                {100,200},
                {300,400},
                {500,600}
        };


//        **************************** Find the size of an Array ******************************

        System.out.println("length of rows :"+ b.length);

        System.out.println("length of columns :"+b[0].length);


//        *************************** Read single value from an Array *************************

        System.out.println("single value from array :"+b[1][1]);

        //   normal for loop
  /*      for (int r = 0; r < b.length; r++) {    // r for rows

            for (int c = 0; c < 2; c++) {      // c for column

                System.out.print(b[r][c]+" ");
            }
            System.out.println();
        }
*/


        // enhanced for loop

        for(int arr[]:b){

            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }










    }
}
