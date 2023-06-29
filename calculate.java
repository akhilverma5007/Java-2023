//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)
import java.util.Scanner;
public class calculate {
    public static void main(String[] args){
        System.out.println("Calculate Program ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.println("Choose operation to perform: Add/Sub/Mul/Div : ");
        String op = input.next().toString();
        if(op.equals("Add")) {
            System.out.println(num1 + num2);
        }
        else if(op.equals("Sub")){
            System.out.println(num1 - num2);
        }
        else if(op.equals("Mul")){
            System.out.println(num1 * num2);
        }
        else if(op.equals("Div")){
            System.out.println(num1 / num2);
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
