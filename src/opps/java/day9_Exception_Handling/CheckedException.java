package opps.java.day9_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("program is started...");


        Thread.sleep(5000);

//        FileInputStream file = new FileInputStream("C:\\TEXT.txt");

        try {
        Thread.sleep(5000);
        }
        catch (InterruptedException e){
            System.out.println("exception handled by catch block..");
            System.out.println(e.getMessage());
        }

        System.out.println("program finish...");









    }
}
