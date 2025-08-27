package strings;
public class stringBuilder {
    public static void main (String args[]){
          StringBuilder sb = new StringBuilder("");
          for(char ch = 'a' ; ch<='z' ; ch++){
            sb.append(ch); 
          }
          System.out.print(sb);
    }   
}


/*
 ✅ Why StringBuilder Is Better:
StringBuilder is mutable (can be changed in place).

It doesn't create a new object each time you append.

Much faster and more efficient for repeated appends.

Task	                                                            Use
One-time or simple concatenation	                              String
Repeated appending (especially in loops)	                    StringBuilder
 */