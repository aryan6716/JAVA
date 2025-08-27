package Recursion;

public class removeDuplicates {
    public static String finalString(String str,int i){
       StringBuilder str2 = new StringBuilder("");
       if(i==str.length()-1){
        return String.valueOf(str.charAt(i));
       }
       if(str.charAt(i)!=str.charAt(i+1)){
        str2 = str2.append(str.charAt(i));
       }
       return finalString(str ,i+1);
    }
    public static void main(String args[]){
       String str = "aaarrryyyyaaannn";
       System.out.println(finalString(str,0));
    }
}
