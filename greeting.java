//2. Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        System.out.println("Enter your name!");
        Scanner input = new Scanner(System.in);
        String displayMessage = input.nextLine();
        System.out.println("Hi " + displayMessage + " " + "welcome to the program.");
    }
}
