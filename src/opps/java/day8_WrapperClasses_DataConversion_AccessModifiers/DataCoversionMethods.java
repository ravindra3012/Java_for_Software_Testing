package opps.java.day8_WrapperClasses_DataConversion_AccessModifiers;

public class DataCoversionMethods {
    public static void main(String[] args) {

//        String type to primitive type
//        String ------> int, double, boolean

        // String ---> int

//        String s = "welcome";    // cannot convert to int (its through NumberFormatException)

/*        String s = "12345";
        int sint = Integer.parseInt(s);
        System.out.println(sint);

        String s1 = "10";
        String s2 = "20";

        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
*/

        // String ---> int

        String s1 = "10.0";
        String s2 =  "55.0";
//        double d = Double.parseDouble(s1);
//        System.out.println(d);

        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));


//        String ---> boolean

        String s3 = "false";

//      other than true you convert String to boolean its give result false
//      when you convert String in to boolean its give false
//   ** but only when you true String convert in boolean its give true *********

        System.out.println(Boolean.parseBoolean(s3));


//        Primitive type to String type
//        int, double, boolean, char -----> String

        int a = 10;
        double b = 20.0;
        char c = 'p';
        boolean bool = true;

        String a1=String.valueOf(a);
        System.out.println(a1);

        String b1=String.valueOf(b);
        System.out.println(b1);

        String c1 = String.valueOf(c);
        System.out.println(c);

        String bool1 = String.valueOf(bool);
        System.out.println(bool1);











    }
}
