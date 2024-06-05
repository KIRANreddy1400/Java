public class ReplacingWithOccurIndex{

    public static void main(String[] args) {
        String inputString = "hello world";
        char targetChar = 'l'; // Character to be replaced

        // Replacing the target character with its occurrence index
        String replacedString = replaceWithOccurrenceIndex(inputString, targetChar);

        // Displaying the modified string
        System.out.println("Original String: " + inputString);
        System.out.println("Replaced String: " + replacedString);
    }

    public static String replaceWithOccurrenceIndex(String str, char targetChar) {
        StringBuilder replacedString = new StringBuilder();
        int occurrenceNumber = 1;
        
        // Iterate through the string and replace each occurrence of the target character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == targetChar) {
                // Replace the target character with its occurrence number
                replacedString.append(occurrenceNumber);
                occurrenceNumber++;
            } else {
                // Keep the original character if it's not the target character
                replacedString.append(currentChar);
            }
        }
        
        return replacedString.toString();
    }
}

