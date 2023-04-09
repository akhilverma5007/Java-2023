import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class WAP_PRT_Simple_Interest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
    int principle = input.nextInt();

        System.out.print("Enter Rate of Interest: ");
    int rate = input.nextInt();

        System.out.print("Enter Time: ");
    int time = input.nextInt();

    int SI = (principle * rate * time) / 100;
        System.out.println("Simple Interest is: " + SI);
    }
}
