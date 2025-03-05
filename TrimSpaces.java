import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Using trim() to remove leading and trailing spaces
        String trimmedString = input.trim();
        
        System.out.println("Output: \"" + trimmedString + "\"");
    }
}
