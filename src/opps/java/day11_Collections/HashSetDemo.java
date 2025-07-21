package opps.java.day11_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
//      Declaration

        HashSet myset = new HashSet();
//        Set myset = new HashSet();
//        HashSet <Integer>myset = new HashSet<Integer>();

//        Adding elements in hashset

        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add('a');
        myset.add(true);
        myset.add(null);
        myset.add(null);
        myset.add(100);


//        size of HashSet
        System.out.println("Size of HashSet "+myset.size());


//        Printing HashSet

        System.out.println(myset);                  // [null, a, 100, 10.5, welcome, true] // we not add duplicate or multiple nulls in HashSet

//        Remove element
        myset.remove(10.5);          // here 10.5 is value (not an index)(there is no index concept like ArrayList)(we have to put direct value to remove it)


//        Inserting element
//        Inserting element is allowed/possible in the hashset


//        Access specific element - Not possible
//        we not access direct but when converting HashSet into ArrayList then it possible

//        Convert HashSet to ArrayList
        ArrayList al = new ArrayList(myset);
        System.out.println(al);         // [null, a, 100, welcome, true]
        System.out.println(al.get(3));       // welcome


//        Read all the elements using advanced for loop
/*        for (Object o:myset) {
            System.out.print(" "+o);            // null a 100 welcome true
        }

 */

//        using Iterator

        Iterator <Object>it = myset.iterator();

        while (it.hasNext()){
            System.out.print(" "+it.next());            // null a 100 welcome true
        }

        System.out.println();

//        Clearing all the elements from HashSet

        myset.clear();

        System.out.println(myset.isEmpty());            //true







    }
}
