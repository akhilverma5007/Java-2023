//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class WAP_Whether_A_Number_Is_Even_Or_Odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
