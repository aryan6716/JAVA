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

StringBuilder sb = new StringBuilder("Hello"); // create
sb.length();              // returns number of characters
sb.capacity();            // returns capacity
sb.append(" World");      // adds at the end
sb.insert(5, ",");        // inserts at index
sb.delete(5, 6);          // deletes from start to end-1
sb.deleteCharAt(5);       // deletes single char at index
sb.replace(0, 5, "Hi");   // replaces from start to end-1
sb.reverse();             // reverses the content
sb.charAt(0);             // returns char at index
sb.setCharAt(0, 'D');     // sets char at index
sb.substring(0, 5);       // returns substring

 */