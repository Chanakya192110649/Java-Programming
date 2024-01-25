import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverse(input);

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    
    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
        
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            
            start++;
            end--;
        }

    
        return new String(charArray);
    }
}
