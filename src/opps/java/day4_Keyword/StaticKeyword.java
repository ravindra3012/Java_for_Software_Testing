package opps.java.day4_Keyword;

public class StaticKeyword {

   static int a = 10;       //static variable
   int b = 20;              //non-static variable

    static void m1(){       //static method
        System.out.println("This is static method...");
    }

    void m2(){              //non-static method
        System.out.println("This is non-static method...");
    }

    void m3(){               //non-static method
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

  /*

   public static void main(String[] args)
    {

//  1) static method can access static stuff directly(without creating object)
        System.out.println(a);
        m1();

//        System.out.println(b);        //  can not access b cause b is non-static variable
//        m2();                         //   can not access m2() cause m2() is non-static method

//  2) static method can access non-static stuff through object
        StaticKeyword st = new StaticKeyword();
        System.out.println(st.b);
        st.m2();

//  3) non-static methods can access everything directly
        st.m3();


    }

   */
}
