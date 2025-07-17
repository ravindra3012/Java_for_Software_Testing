package basic.java.variables;

public class InstanceVariable {

    //variable which is declared outside all the methods and inside the class  is called as instance variable
    // without static keyword

    int x = 10;
    // x is instance variable
    // class level variable
    // non-static variable



    public static void main(String[] args) {

        InstanceVariable obj = new InstanceVariable();
        System.out.println(obj.x);    // we can call instance  variable with the help of creating object (with object reference)

    }
}
