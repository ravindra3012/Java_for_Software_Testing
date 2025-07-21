package opps.java.day10_Type_Casting;

//      Cat ct = (Cat) an;
//       A   b     C    d
//       A b = (C) d;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}


public class TypeCastingObjects2 {
    public static void main(String[] args) {

//        Rule 1 : conversion is valid or not
//        The type of 'd' and 'C' must have same relationship(either parent to child or child to parent)
//        ( Rule 1 gives compile time exception (syntax error))

//            Animal an = new Dog();
//            Cat ct = (Cat) an;          // invalid as per Rule 1

//            Dog dg = new Dog();
//            Cat ct = (Cat) dg;            // invalid as per Rule 1

//        Rule 2 : assignment is valid or not
//        'C' must be either same or child of 'A'
//        ( Rule 2 gives compile time exception (syntax error))

//            Animal an = new Dog();
//            Cat ct = (Cat) an;              // valid as per Rule 2

//            Animal an = new Dog();
//            Cat ct = (Dog) an;              // invalid as per Rule 2

//        Rule 3 :
//        The underlying object type of 'd' must be either same or child of 'C'
//        ( Rule 3 gives run time exception (When you run the program))
//            Animal an = new Dog();
//            Cat ct = (Cat) an;                // invalid as per Rule 3


//        Rule 1, Rule 2, Rule 3
            Animal an = new Dog();
            Dog dg = (Dog) an;                  // valid as per  Rule 1, Rule 2, Rule 3




    }
}
