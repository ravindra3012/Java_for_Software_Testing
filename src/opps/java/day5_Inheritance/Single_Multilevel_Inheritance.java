package opps.java.day5_Inheritance;

class A{
    int a=10;
    void display(){
        System.out.println(a);
    }
}

class B extends A
{
    int b=20;
    void show(){
        System.out.println(b);
    }
}

class C extends B
{
    int c = 30;
    void print(){
        System.out.println(c);
    }
}

class D extends A
{
    int c = 30;
    void print(){
        System.out.println(c);
    }
}

public class Single_Multilevel_Inheritance {
    public static void main(String[] args) {

//        B bobj = new B();
//
//        System.out.println(bobj.a);
//        System.out.println(bobj.b);
//
//        bobj.display();
//        bobj.show();



          C cobj = new C();

          System.out.println(cobj.a);
          System.out.println(cobj.b);
          System.out.println(cobj.c);

          cobj.display();
          cobj.show();
          cobj.print();

          D dobj = new D();



















    }
}
