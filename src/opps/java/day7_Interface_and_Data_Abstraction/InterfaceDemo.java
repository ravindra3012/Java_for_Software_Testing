package opps.java.day7_Interface_and_Data_Abstraction;

interface Shape{
    int lenght=10;      // by default final & Static
    int width=20;       // by default final & Static

    void circle();      //abstract method

    default void square(){
        System.out.println("this is square - default method ");
    }

    static void rectangle(){
        System.out.println("this is rectangle - static method");
    }
}

public class InterfaceDemo implements Shape
{
    public void circle(){
        System.out.println("this is circle - abstract method ");
    }

    public static void main(String[] args) {

//        Scenario 1
//
//        InterfaceDemo idobj = new InterfaceDemo();
//        idobj.circle();         //abstract method
//        idobj.square();         //default method
//        Shape.rectangle();      //static method can display access from interface


//        Scenario 2

        Shape sh = new InterfaceDemo();
        sh.circle();        // abstract
        sh.square();        // default
        Shape.rectangle();  //static method can display access from interface




















    }
}
