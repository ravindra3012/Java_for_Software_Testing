package opps.java.day1_methods;

public class Greetings {

//    1) No parameter , No Return value

    void m1(){
        System.out.println("Hello....");
    }


//    2) No parameter , Return value

    String m2(){
        return "Hello how are you??";
    }

//    3) Takes parameter , No Return value

    void m3(String name){
        System.out.println("Hello "+name);
    }

//    4) Takes parameter , Return value

    String m4(String name){
        return("Hello "+name);
    }

    int m5(int a,int b){
        return(a+b);
    }


}
