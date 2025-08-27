package Oops;

public class oops {
    public static void main(String args[]){
        Pen p1 = new Pen();   //created pen object called p1 in heap
        p1.setColour("blue");   //through dot operator(.) we can access the properties of any given function
        System.out.println(p1.colour);  //blue
        p1.setTip("5");
        System.out.println(p1.tip);  //5 
        }
}

class Pen{   //class of pen
    String colour;
    String tip;

    void setColour(String newColour){
        colour = newColour;
    }

    void setTip(String newTip){
        tip = newTip;
    } 
}
