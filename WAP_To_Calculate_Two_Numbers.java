import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class WAP_To_Calculate_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Operator: ");
        char opp = input.next().charAt(0);
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();
        int add = num1 + num2;
        int sub = num1 - num2;
        int div = num1 / num2;
        int mul = num1 * num2;

        if (opp == '+') {
            System.out.println("Addition of two numbers is: " + add);
        } else if (opp == '-') {
            System.out.println("Subtraction of two numbers is: " + sub);
        } else if (opp == '/') {
            System.out.println("Division of two numbers is: " + div);
        } else if (opp == '*') {
            System.out.println("Multiplication of two numbers is: " + mul);
        }
    }
}