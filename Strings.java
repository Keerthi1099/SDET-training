package com.src.strings;

public class Strings {

	public static <string> void main(String[] args) 
		// TODO Auto-generated method stub
  
	
		    {
		        String str = "Hello, Java World!";

		        // 1. Length of the string
		        System.out.println("Length: " + str.length());

		        // 2. Convert to Uppercase
		        System.out.println("Uppercase: " + str.toUpperCase());

		        // 3. Convert to lowercase
		        System.out.println("Lowercase: " + str.toLowerCase());

		        // 4. Find a character at a specific index
		        System.out.println("Character at index 7: " + str.charAt(7));

		        // 5. Substring
		        System.out.println("Substring (7, 11): " + str.substring(7, 11));

		        // 6. Check if string contains a substring
		        System.out.println("Contains 'Java': " + str.contains("Java"));

		        // 7. Replace a substring with another
		        System.out.println("Replace 'Java' with 'Programming': " + str.replace("Java", "Programming"));

		        // 8. Check if string starts with a prefix
		        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

		        // 9. Check if string ends with a suffix
		        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

		        // 10. Split the string into an array
		        String[] words = str.split(" ");
		        System.out.println("Words in the string:");
		        for (String word : words) {
		            System.out.println(word);
		        }

		        // 11. Trim whitespace from the string
		        String strWithSpaces = "   Hello, Java World!   ";
		        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

		        // 12. Concatenate two strings
		        String greeting = "Hello";
		        String name = "Keerthi";
		        System.out.println("Concatenated string: " + greeting.concat(", ").concat(name).concat("!"));

		        // 13. Convert a string to a char array
		        char[] charArray = str.toCharArray();
		        System.out.println("Char array:");
		        for (char c : charArray) {
		            System.out.print(c + " ");
		        }
		            
		       // 14. Compare two strings (case-sensitive)
		        String str1 = "Hello";
		        String str2 = "hello";
		        System.out.println("\nCase-sensitive comparison (str1.equals(str2)): " + str1.equals(str2));

		       // 15. Compare two strings (case-insensitive)
		        System.out.println("Case-insensitive comparison (str1.equalsIgnoreCase(str2)): " + str1.equalsIgnoreCase(str2));

		        // 16. Index of a character or substring
		         System.out.println("Index of 'J': " + str.indexOf('J'));
		         System.out.println("Index of 'Java': " + str.indexOf("Java"));

		        // 17. Last index of a character or substring
		        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

		        // 18. Check if string is empty
		        String emptyStr = "";
		        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

		        // 19. Join multiple strings
		        String joinedStr = String.join(" ", "Hello", "Java", "World");
		        System.out.println("Joined string: " + joinedStr);

		        }
		    
	

	}


