public class ReverseString {

    public static String reverseString(String originalString) {

        if (originalString == null || originalString.isEmpty()) {
            return originalString;
        }

        
        StringBuilder reversed = new StringBuilder();

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversed.append(originalString.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input1 = "Turan";
        String output1 = reverseString(input1);
        System.out.println("Original: \"" + input1 + "\"");
        System.out.println("Reversed: \"" + output1 + "\"");
        
    }
}
