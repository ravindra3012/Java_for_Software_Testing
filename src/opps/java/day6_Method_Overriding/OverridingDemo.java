package opps.java.day6_Method_Overriding;

import java.lang.annotation.Documented;

class RbiBank{
    double roi() {
        return 8.5;
    }
}

class HDFC extends RbiBank
{
    double roi() {
        return 10.5;
    }
}

class SBI extends RbiBank
{
    double roi() {
        return 14.5;
    }
}

public class OverridingDemo {
    public static void main(String[] args) {

        RbiBank bk = new RbiBank();
        System.out.println("RBI bank's rate of interest: "+bk.roi());

        HDFC hd = new HDFC();
        System.out.println("HDFC bank's rate of interest: "+hd.roi());

        SBI sb = new SBI();
        System.out.println("SBI bank's rate of interest: "+sb.roi());

    }
}
