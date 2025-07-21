package opps.java.day11_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

//        Declaration

//        HashMap hm = new HashMap();
//        Map hm = new HashMap();
        HashMap<Integer,String> hm = new HashMap<Integer,String>();


//        Adding pairs

        hm.put(101,"Sagar");
        hm.put(102,"Akshay");
        hm.put(103,"Bhau");
        hm.put(104,"Amol");
        hm.put(102,"David");

        System.out.println(hm);     //{101=Sagar, 102=David, 103=Bhau, 104=Amol}    // in HashMap Duplicate values are override with new values


//        Size of HashMap

        System.out.println(hm.size());          //4


//        Remove pair

        hm.remove(104);             // here 104 is key of the pair
        System.out.println("After removing the pair "+hm);        // {101=Sagar, 102=David, 103=Bhau}


//        Access value of the key
        System.out.println(hm.get(102));                //David


//        Get all the key and values from hashmap

        System.out.println(hm.keySet());        // [101, 102, 103]
        System.out.println(hm.values());        // [Sagar, David, Bhau]
        System.out.println(hm.entrySet());      // [101=Sagar, 102=David, 103=Bhau]


//       Reading data from hashmap

        // using Advanced for loop
 /*       for (int k:hm.keySet()){
            System.out.print(" "+k+" "+hm.get(k));              //  101 Sagar 102 David 103 Bhau
        }

  */

        // using Iterator

        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }


//        Remove all the data from hashmap

        hm.clear();
        System.out.println(hm.isEmpty());       //true





    }
}
