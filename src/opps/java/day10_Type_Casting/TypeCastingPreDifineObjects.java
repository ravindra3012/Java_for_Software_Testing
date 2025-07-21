package opps.java.day10_Type_Casting;

//      A b = (C) d;

public class TypeCastingPreDifineObjects {
    public static void main(String[] args) {

//        Ex 1:
//        Object o = new String("welcome");
//        StringBuffer sb = (StringBuffer) o;        // Rule 1-passed, Rule 2-passed, Rule 3-failed

//        Ex 2:
//        String s = new String("welcome");
//        StringBuffer sb = (StringBuffer) s;         // Rule 1-failed

//        Ex 3:
//        Object o = new String("welcome");
//        StringBuffer sb = (String) o;                 // Rule 1-passed, Rule 2-failed


//        Ex 4:
//        String s = new String("welcome");
//        StringBuffer sb = (String) s;                   // Rule 1-passed, Rule 2-failed

//        Ex 5:
        Object o = new String("welcome");
        String s = (String) o;                          // Rule 1-passed, Rule 2-passed, Rule 3-passed
        System.out.println(s);

        
        //  *Note
//          Object is Parent class of all classes like (String, StringBuffer, etc) (it is predefined classes)
        
        
    }
}
