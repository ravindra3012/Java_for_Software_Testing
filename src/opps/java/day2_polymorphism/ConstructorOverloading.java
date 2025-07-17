package opps.java.day2_polymorphism;

public class ConstructorOverloading {

    //******** Constructor Overloading  ************

    double width, height, depth;

    ConstructorOverloading(){
        /*
        width=0;                    //1
        height=0;
        depth=0;
         */
        width=height=depth=0;
    }

    ConstructorOverloading(double w,double h,double d){
        width=w;                    //2
        height=h;
        depth=d;
    }

    ConstructorOverloading(double len){

        width=height=depth=len;     //3
    }

    double volume(){
        return(width*height*depth);
    }
}
