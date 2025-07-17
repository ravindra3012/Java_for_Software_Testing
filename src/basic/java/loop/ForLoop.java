package basic.java.loop;

public class ForLoop {
    public static void main(String[] args) {

//        for loop
// **************************   syntax     ***************

    /*

      for (initialization;condition;inc/dec)
        {
            statements;
        }

     */

// ********************  examples     ************************
//        1) print even and odd numbers

        for (int i = 1; i <=100; i++) {
            if (i%2==0){
                System.out.println(i +" even number");
            }
            else {
                System.out.println(i +" odd number");
            }

        }





    }
}
