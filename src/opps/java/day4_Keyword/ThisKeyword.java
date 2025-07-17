package opps.java.day4_Keyword;

public class ThisKeyword {

    int a,b;

//    ThisKeyword(int a,int b){
//        this.a=a;
//        this.b=b;
//    }


    void setData(int a,int b){
        this.a=a;
        this.b=b;
    }

    void display(){
        System.out.println(a);
        System.out.println(b);
    }



    public static void main(String[] args) {

//        ThisKeyword th = new ThisKeyword(100,200);
//        th.display();

          ThisKeyword th = new ThisKeyword();
          th.setData(10,20);
          th.display();

    }
}
