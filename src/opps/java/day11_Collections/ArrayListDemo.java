package opps.java.day11_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

//        Declaration
        ArrayList mylist = new ArrayList();
//        List myllist = new ArrayList();
//        ArrayList <String>mylist = new ArrayList<String>();


//        Adding data into arraylist
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add('R');
        mylist.add(true);
        mylist.add(null);
        mylist.add(null);
        mylist.add(100);


//        Size of ArrayList
        System.out.println("Size of arraylist: "+mylist.size());


//        Printing arraylist
        System.out.println("Printing arraylist: "+mylist);


//        Remove element from arraylist
        mylist.remove(5);           // here 5 index of element
        System.out.println("After removing: "+mylist);


//        Insert element in the arraylist
        mylist.add(2,"java");
        System.out.println("After insertion: "+mylist);


//        Replace element in the arraylist (modify/replace/change)
        mylist.set(2,"python");
        System.out.println("After replacing: "+mylist);


//        Access specific element from arraylist
//        mylist.get(3);                      // here 3 is index
        System.out.println(mylist.get(3));


//        Reading all the element individually from arraylist

//        using normal for loop

/*        for(int i=0;i<mylist.size();i++){
            System.out.print(" "+mylist.get(i));
        }
 */

//        using advanced for loop
/*
        for (Object x:mylist){
            System.out.print(" "+x);
        }
 */

//        using iterator

/*        Iterator it = mylist.iterator();

        while (it.hasNext()){                     // here .hasNext() method check element and go for next element
            System.out.print(" "+it.next());      // here .next() method print the value
        }
 */


//       Checking arraylist is empty or not

        System.out.println("Is arraylist empty? "+mylist.isEmpty());



//        Remove element Randomly from arraylist

        ArrayList mylist2 = new ArrayList();
        mylist2.add(100);
        mylist2.add("welcome");

        mylist.removeAll(mylist2);
        System.out.println("After removing multiple element: "+mylist);


//        Remove all the element/clear
        mylist.clear();
        System.out.println("Is arraylist empty? "+mylist.isEmpty());








    }
}
