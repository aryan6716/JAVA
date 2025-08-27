package arrays;

public class linear_search {
    public static int linearsearch(int marks[],int find){
        for (int i=0 ; i<marks.length ; i++){
            if (marks[i]==find){
                System.out.print("index:"+i);
                return i ;
            }
        } 
        System.out.print("index not found:");  //in casse element not found
        return -1;  
    }
    public static void main (String args[]){
    int marks[] = {6,8,9,7,4};
    int find = 9;
    linearsearch(marks , find);  
    } 
}
