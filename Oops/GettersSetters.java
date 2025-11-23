package Oops;

public class GettersSetters {
    public static void main(String args[]){
        Pen p1 = new Pen();   
        p1.setColour("blue");  
        System.out.println(p1.getColour());  
        p1.setTip(5);
        System.out.println(p1.getTip());  
    }
}

class Pen{   //class of pen
    private String colour;
    private int tip;

    String getColour(){    //get colour
        return this.colour;
    }
 
    int getTip(){          //setters
        return this.tip;    
    }

    
    public void setColour(String newColour){
        this.colour = newColour;
    }

    public void setTip(int newTip){
        this.tip = newTip;
    }     
}
