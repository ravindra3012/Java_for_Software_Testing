package basic.java.variables;

public class LocalVariable {

    public void add(){
        int a = 10;
        System.out.println(a);
        // a is local variable
        // local variable only accessible in that particular declared method
        // local variable cant access in another method or main method

    }

    public static void main(String[] args) {

        LocalVariable obj = new LocalVariable();

        obj.add();
    }
}
