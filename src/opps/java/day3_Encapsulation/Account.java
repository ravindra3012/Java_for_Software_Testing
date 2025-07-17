package opps.java.day3_Encapsulation;

public class Account {

    private int accno;
    private String name;
    private double amount;


    public int getAccno() {
        return accno;                   //1
    }

    public void setAccno(int accno) {
        this.accno = accno;             //1
    }

    public String getName() {
        return name;                    //2
    }

    public void setName(String name) {
        this.name = name;               //2
    }

    public double getAmount() {
        return amount;                  //3
    }

    public void setAmount(double amount) {
        this.amount = amount;           //3
    }
}
