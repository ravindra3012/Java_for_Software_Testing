package basic.java.variables;

public class StaticVariable {

    static int a = 10;              //static/class level variable

    public static void main(String[] args) {

        // three approach to static variable

        System.out.println(a);      //  directly

//        **************************************************************

        StaticVariable obj = new StaticVariable();

        System.out.println(obj.a);          // by creating object ( object reference)

//        ******************************************************************

        System.out.println(StaticVariable.a);           // by class name ( class reference)

    }
}
