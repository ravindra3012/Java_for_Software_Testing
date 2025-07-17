package opps.java.day4_Keyword;

class Animal{
    String colour = "white";

    void eat(){
        System.out.println("eating.....");
    }
}

class Dog extends Animal
{
    String colour = "black";

    void displayColor(){
        System.out.println(super.colour);
    }

    void eat(){
//        System.out.println("eating bread");
        super.eat();
    }
}

public class SuperKeyword {
}
