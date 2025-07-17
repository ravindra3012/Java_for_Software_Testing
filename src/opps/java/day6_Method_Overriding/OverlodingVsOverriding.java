package opps.java.day6_Method_Overriding;

class ABC{
    void m1(int a){
        System.out.println(a);
    }
    void m2(int b){
        System.out.println(b);
    }
}

class XYZ extends ABC
{
    void m1(int a){                                 // Override
        System.out.println(a*a);
    }
    void m2(int a,int b){                           // Overload
        System.out.println(a+b);
    }
}

public class OverlodingVsOverriding {
    public static void main(String[] args) {

        XYZ xyzobj = new XYZ();

        xyzobj.m1(10);
        xyzobj.m2(100);
        xyzobj.m2(20,30);

    }
}

































