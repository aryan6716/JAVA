package arrays;

public class linear_search {
    public static int linearsearch(int marks[],int find){
        for (int i=0 ; i<marks.length ; i++){
            if(marks.length==0) return -1;

            if (marks[i]==find){
                System.out.print("index: "+i+"\n");
                return i ;
            }
        } 
        System.out.print("index not found:\n");  //in case element not found
        return -1;  //execute if not found
    }
    public static void main (String args[]){
    int marks[] = {6,8,9,7,4};
    int find = 9;
    linearsearch(marks , find);  
    } 
}
//search the array : return the index if item found, otherwise -1 
