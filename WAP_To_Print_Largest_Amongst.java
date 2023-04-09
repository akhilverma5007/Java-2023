import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class WAP_To_Print_Largest_Amongst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Comparison Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Comparison Number 2: ");
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is greater.");
        }else{
            System.out.println(num2 + " is greater.");
        }
    }
}
