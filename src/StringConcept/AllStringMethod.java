package StringConcept;

public class AllStringMethod {
	    public static void main(String[] args) {
	        String str = "Hello World";
	        String str2 = "   Hello Sachin ";

	        // 1. length()
	        System.out.println("Length: " + str.length());

	        // 2. charAt()
	        System.out.println("Char at index 4: " + str.charAt(4));

	        // 3. substring()
	        System.out.println("Substring(0, 5): " + str.substring(0, 5));

	        // 4. contains()
	        System.out.println("Contains 'World'? " + str.contains("World"));

	        // 5. equals()
	        System.out.println("Equals 'Hello World'? " + str.equals("Hello= World"));

	        // 6. equalsIgnoreCase()
	        System.out.println("Equals Ignore Case 'hello world'? " + str.equalsIgnoreCase("hello world"));

	        // 7. toLowerCase()
	        System.out.println("To Lower Case: " + str.toLowerCase());

	        // 8. toUpperCase()
	        System.out.println("To Upper Case: " + str.toUpperCase());

	        // 9. indexOf()
	        System.out.println("Index of 'o': " + str.indexOf('o'));

	        // 10. lastIndexOf()
	        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

	        // 11. startsWith()
	        System.out.println("Starts with 'Hell'? " + str.startsWith("Hell"));

	        // 12. endsWith()
	        System.out.println("Ends with 'World'? " + str.endsWith("World"));

	        // 13. isEmpty()
	        System.out.println("Is empty? " + str.isEmpty());

	        // 14. trim()
	        System.out.println("Trimmed: '" + str2.trim() + "'");

	        // 15. replace()
	        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));

	        // 16. replaceAll() (uses regex)
	        System.out.println("ReplaceAll 'o' with '*': " + str.replaceAll("o", "*"));

	        // 17. split()
	        String[] words = str.split(" ");
	        System.out.println("Split words:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // 18. compareTo()
	        System.out.println("CompareTo 'Hello': " + str.compareTo("Hello"));

	        // 19. compareToIgnoreCase()
	        System.out.println("CompareToIgnoreCase 'hello world': " + str.compareToIgnoreCase("hello world"));

	        // 20. concat()
	        System.out.println("Concat with ' Java': " + str.concat(" Java"));

	        // 21. toCharArray()
	        char[] charArray = str.toCharArray();
	        System.out.print("Char Array: ");
	        for (char ch : charArray) {
	            System.out.print(ch + " ");
	        }
	        System.out.println();

	        // 22. valueOf()
	        int number = 123;
	        String numStr = String.valueOf(number);
	        System.out.println("ValueOf int 123: " + numStr);

	        // 23. matches() (regex)
	        System.out.println("Matches regex 'Hello.*'? " + str.matches("Hello.*"));

	        // 24. intern()
	        String s1 = new String("OpenAI");
	        String s2 = "OpenAI";
	        System.out.println("Before intern: " + (s1 == s2));  // false
	        s1 = s1.intern();
	        System.out.println("After intern: " + (s1 == s2));   // true
	    }
	}
