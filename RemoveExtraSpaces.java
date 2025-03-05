import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Trim leading and trailing spaces, then replace multiple spaces with a single space
        String cleanedString = input.trim().replaceAll("\\s+", " ");
        
        System.out.println("Output: \"" + cleanedString + "\"");
    }
}
