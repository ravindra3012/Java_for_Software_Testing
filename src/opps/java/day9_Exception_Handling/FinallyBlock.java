package opps.java.day9_Exception_Handling;

public class FinallyBlock {
    public static void main(String[] args) {

        //   finally block always execute

        System.out.println("program started...");
        String s = null;
        try {
            System.out.println(s.length());             //NullPointerException
        }
        catch (Exception e){
            System.out.println("catch block handled exception");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("You are enter into finally block..");
        }

        System.out.println("program finished....");



    }
}
