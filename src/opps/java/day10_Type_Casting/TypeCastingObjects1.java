package opps.java.day10_Type_Casting;

class Parent{
    String name = "Jhon";
    void m1(){
        System.out.println("This is m1 method from Parent");
    }
}

class Child extends Parent
{
    int id = 101;
    void m2(){
        System.out.println("This is m2 method from Child");
    }
}


public class TypeCastingObjects1 {
    public static void main(String[] args) {

    /*    Child c = new Child();
        System.out.println(c.name);         // parent
        c.m1();                             // parent
        System.out.println(c.id);           // child
        c.m2();                             // child
     */


/*      Parent p = new Child();         // upcasting

        System.out.println(p.name);     // parent
        p.m1();                         // parent

//        System.out.println(p.id);       // we cannot access
//        p.m2();                         // we cannot access
 */

/*        Parent p = new Parent();          // downcasting

        Child c = (Child) p;

        // We not get syntax error by ide but when we run the program its gives runtime exception(ClassCastException)

//******* Casting 'p' to 'Child' will produce 'ClassCastException' for any non-null value
        System.out.println(c.name);         // parent
        System.out.println(c.id);           // child
        c.m1();                             // parent
        c.m2();                             // child
 */










    }
}
