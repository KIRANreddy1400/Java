import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter input String");
        String input = Sc.nextLine();
        Sc.close();
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right positions
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move left pointer to the right and right pointer to the left
            left++;
            right--;
        }

        // Convert char array back to string
        return new String(charArray);
    }
}

