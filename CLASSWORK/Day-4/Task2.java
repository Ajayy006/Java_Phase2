import java.util.*;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int mark = sc.nextInt();
        try {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Invalid mark Exception: Enter a mark between 0 and 100.");
            }
            System.out.println("Mark: " + mark);
        }
        catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }
    }
}