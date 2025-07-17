package opps.java.day4_Keyword;

public class StaticMain {
    public static void main(String[] args)
    {

//  1) static method can access static stuff directly(without creating object)
      // to access static variable or static method from another CLASS
      // then you have to use their class name like following
        System.out.println(StaticKeyword.a);
        StaticKeyword.m1();

//        System.out.println(b);        //  can not access b cause b is non-static variable
//        m2();                         //   can not access m2() cause m2() is non-static method

//  2) static method can access non-static stuff through object
        StaticKeyword st = new StaticKeyword();
        System.out.println(st.b);
        st.m2();

//  3) non-static methods can access everything directly
        st.m3();


    }
}
