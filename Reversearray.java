

public class Reversearray {
     public static void main(String[] args) {

        // Step 1: Declare the String
        String companyName = "TestLeaf";

        // Step 2: Convert String to Character Array
        char[] charArray = companyName.toCharArray();

        // Step 3: Loop from last index to first index
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}