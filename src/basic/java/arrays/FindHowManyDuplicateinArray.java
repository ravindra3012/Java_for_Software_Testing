package basic.java.arrays;

public class FindHowManyDuplicateinArray {
    public static void main(String[] args) {

        int[] a={10,20,10,30,10,50,50,90,40,10};
        int search_element=50;
        int count=0;

        for (int x:a){
            if (x==search_element){
                count++;
            }
        }
        System.out.println(count);



    }
}
