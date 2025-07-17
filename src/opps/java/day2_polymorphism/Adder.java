package opps.java.day2_polymorphism;

public class Adder {

    //******** Method Overloading ************

    int x=10;
    int y=20;

    void sum(){
        System.out.println(x+y);        //1
    }

    void sum(int a,int b){
        System.out.println(a+b);        //2
    }

    void sum(int a,double b){
        System.out.println(a+b);        //3
    }

    void sum (double a,int b){
        System.out.println(a+b);        //4
    }

    void sum(int a,int b,int c){
        System.out.println(a+b+c);      //5
    }


}
