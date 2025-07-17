package basic.java.arrays;

public class SearchingElementInArray {
    public static void main(String[] args) {

        int arr[]={10,20,40,50,90};

        int search_element = 40;

        boolean status = false;

/*
        linear search with normal for loop


        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==search_element){
                System.out.println("Element found ");
                status = true;
                break;
            }
        }

        if (status==false){
            System.out.println("Element not found ");
        }

*/


//        linear search with normal for loop

        for (int x:arr){
            if (x==search_element){
                System.out.println("Element found");
                status = true;
                break;
            }
        }
        if (status==false){
            System.out.println("Element not found");
        }





    }

}
