package opps.java.day4_Keyword;

class Test {
    final int a = 10;
}

public class FinalKeyword {
    public static void main(String[] args) {

        Test t = new Test();
//      t.a=20;                 // incorrect, bcoz x is final variable( final variable's value can't change its constant )
        System.out.println(t.a);
    }
}
