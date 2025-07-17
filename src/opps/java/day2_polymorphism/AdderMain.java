package opps.java.day2_polymorphism;

public class AdderMain {

    public static void main(String[] args) {

        //******** Method Overloading ************

        Adder addobj = new Adder();

        addobj.sum();                          //1

        addobj.sum(100,200);             //2

        addobj.sum(100,10.5);            //3

        addobj.sum(10.5,10);             //4

        addobj.sum(10,20,30);         //5


    }
}
