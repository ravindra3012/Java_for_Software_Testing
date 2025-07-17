package opps.java.day5_Inheritance;

class Parent {

    void display(int a) {
        System.out.println(a);
    }
}

class Child1 extends Parent
{
        void print(int b){
            System.out.println(b);
        }
}

class Child2 extends Parent
{
    void show(int c){
        System.out.println(c);
    }

}

public class HierarchyInheritance {
    public static void main(String[] args) {

        Child1 c1 = new Child1();
        c1.print(10);
        c1.display(20);


        Child2 c2 = new Child2();
        c2.show(10);
        c2.display(200);

        


    }
}
