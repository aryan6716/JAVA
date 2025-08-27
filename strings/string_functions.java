/*
 
🧩 1. String Creation and Conversion

Creates an empty string	String s = new String();             String s = new String();	
Converts int to string                                       String.valueOf(123) → "123" 
Converts boolean to string	                                 String.valueOf(true) → "true"

🧪 2. Comparison Methods

Case-sensitive equality	                                    "abc".equals("abc") → true
Case-insensitive equality	                                "abc".equalsIgnoreCase("ABC") → true
compareTo(Object o)                                          a".compareTo("b") → -1

🔍 3. Search Methods

Checks if contains	                                        "hello".contains("ell") → true
Checks prefix	                                            "hello".startsWith("he") → true
Checks suffix	                                            "hello".endsWith("lo") → true
First occurrence	                                        "banana".indexOf("a") → 1
Last occurrence	                                            "banana".lastIndexOf("a") → 5
From index	                                                "banana".indexOf("a", 2(start index)) → 3

✂️ 4. Substring and Splitting

substring(int begin)     From index to end	              "hello".substring(2) → "llo"
substring(int begin, int end)	Between indexes	           "hello".substring(1,4) → "ell"
split(String regex)	Split by regex	                       "a,b,c".split(",") → ["a", "b", "c"]

✏️ 5. Modification/Transformation

All lowercase	                                            "HELLO".toLowerCase() → "hello"
All uppercase	                                            "hello".toUpperCase() → "HELLO"
Remove leading/trailing spaces	                            " hi ".trim() → "hi"
replace(char old, char new)	Replace chars	                "hello".replace('l', 'x') → "hexxo"
replace(CharSequence, CharSequence)	Replace substrings	    "hi hi".replace("hi","hey") → "hey hey"
emoves leading whitespace only	                            " hi".stripLeading() → "hi"
Removes trailing whitespace only	                        "hi ".stripTrailing() → "hi"
Repeats the string	                                        "ab".repeat(3) → "ababab"

📏 6. Length and Emptiness

Returns length	                                            "hello".length() → 5
Checks if empty	                                            "".isEmpty() → true
(Java 11+)	Empty or only whitespace	                    " ".isBlank() → true

📦 7. Character Access and Arrays

charAt(int index)	Returns char at index                  	"hello".charAt(1) → 'e'
toCharArray()	Converts to char array                   	"hi".toCharArray() → ['h', 'i']

🔗 8. String Joining and Formatting

concat(String str)	Concatenate strings	                    "hi".concat(" there") → "hi there"
String.join(delimiter, elements...)	Join strings	        String.join("-", "a", "b") → "a-b"



 */