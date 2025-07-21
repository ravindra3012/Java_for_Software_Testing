package opps.java.day10_Type_Casting;

/*     1) Up casting / Widening
     ----------------------------
     converting value from smaller to larger
     eg-  int ----> long
     float ---> double

       2) Down casting / Narrowing
     ----------------------------
     converting value from larger to smaller
     eg- long ---> int
     double ---> float9
 */


public class TypeCastingConcept {
    public static void main(String[] args) {

        // upcasting - automatic ----- smaller to larger

    /*  eg 1)
        int intvalue = 100;
        long longvalue = intvalue;
        System.out.println(longvalue);
     */

     /*   eg 2)
        float floatvalue = 10.5f;
        double doublevalue = floatvalue;
        System.out.println(doublevalue);
     */


//        downcasting - manually ----- larger to smaller
//
//        long longvalue = 1000000;
//        int intvalue = (int) longvalue;
//
//        double doublevalue = 568541268975421987.5412;
//        float floatvalue = (float) doublevalue;
//        System.out.println(floatvalue);



//        Eg 1)
    /*    int i = 100;
        double d = i;                   // upcasting
        System.out.println(d);
    */

//        Eg 2)
        double d =10.5;
        int i =(int) d;                 // down casting
        System.out.println(i);      //result = 10


    }
}
