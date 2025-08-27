package Stack;

import java.util.Stack;

public class maxAreaHistogram {
    public static void maxArea(int width[]){
        int Mxarea = 0;
        int nsr[] = new int[width.length];
        int nsl[] = new int[width.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = width.length-1 ; i>-1 ; i--){
            while(!s.isEmpty() && width[s.peek()] >= width[i]){
                s.pop();
            }
            if(s.isEmpty()) nsr[i] = width.length;
            else nsr[i] = s.peek();
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();  //empty stack
        for(int i =0 ; i<width.length; i++){
            while(!s.isEmpty() && width[s.peek()] >= width[i]){
                s.pop();
            }
            if(s.isEmpty()) nsl[i] = -1;
            else nsl[i] = s.peek();
            s.push(i);
        }

        //area : width=j-i-1 == nsr[i] - nsl[i] - 1
        for(int i =0 ; i<width.length; i++){
            int h = width[i];
            int w = nsr[i] - nsl[i] - 1;
            int currarea  = h * w;
            Mxarea = Math.max(currarea,Mxarea);
        }
    System.out.println("Max Area: " + Mxarea);
    }
    public static void main(String[] args) {
        int width[] = {2,1,5,6,2,3};
        maxArea(width);
    }
}
