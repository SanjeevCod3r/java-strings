import java.util.Scanner;

public class ASCIIValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Taking a single character input
        
        // Casting char to int to get ASCII value
        int asciiValue = (int) ch;
        
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
