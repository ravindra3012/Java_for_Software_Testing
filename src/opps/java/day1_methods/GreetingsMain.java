package opps.java.day1_methods;

public class GreetingsMain {
    public static void main(String[] args) {

        Greetings gr = new Greetings();
        gr.m1();        // 1) No parameter , No Return value

        String s = gr.m2();        // 2) No parameter , Return value
        System.out.println(s);

        gr.m3("Sagar");       // 3) Takes parameter , No Return value

        String var = gr.m4("Akshay");      // 4) Takes parameter , Return value
        System.out.println(var);

        int sum = gr.m5(100,20);
        System.out.println(sum);
    }
}
