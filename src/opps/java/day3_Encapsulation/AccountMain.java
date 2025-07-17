package opps.java.day3_Encapsulation;

public class AccountMain {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.setAccno(101);                      //1
        System.out.println(acc.getAccno());     //1

        acc.setName("Sagar");                   //2
        System.out.println(acc.getName());      //2

        acc.setAmount(250000);                  //3
        System.out.println(acc.getAmount());    //3


    }
}
