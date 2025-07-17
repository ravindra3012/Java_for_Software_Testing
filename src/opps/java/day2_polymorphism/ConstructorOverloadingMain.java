package opps.java.day2_polymorphism;

public class ConstructorOverloadingMain {

    public static void main(String[] args) {


        //******** Constructor Overloading  ************

        ConstructorOverloading a = new ConstructorOverloading();
//        double b = a.volume();
        System.out.println(a.volume());         //1

        ConstructorOverloading a1 = new ConstructorOverloading(10.0,10.0,10.0);
        System.out.println(a1.volume());        //2

        ConstructorOverloading a2 = new ConstructorOverloading(20.0);
        System.out.println(a2.volume());        //3


    }
}
