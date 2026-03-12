public class StringManipulation {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);
        String upperCase = original.toUpperCase();
        System.out.println("Uppercase: " + upperCase);
        String lowerCase = original.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);
        boolean containsSubstring = original.contains("World");
        System.out.println("Contains 'World': " + containsSubstring);
        boolean startswith= original.startsWith("H");
        System.out.println("startswith'Hello,': " + startswith);
        String replaced = original.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replaced);
        String substring = original.substring(7, 12); 
        System.out.println("Substring (7,12): " + substring);
        String trimmed = "   Hello Java!   ".trim();
        System.out.println("Trimmed: " + trimmed );
        String[] words = original.split(" ");
        System.out.println("Words in the original string:");
        int n= words.length;
        int i;
        for (i=0;i<n;i++) {
            System.out.println(words[i]);
        }
    }
}

