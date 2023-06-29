// 1. Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class Odd_Even{
    public static void main(String[] args){
        System.out.println("Enter a Number to check whether its odd or even ");
        Scanner input = new Scanner(System.in);
        int numberToCheck = input.nextInt();
        if(numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is even ");
        }
        else{
            System.out.println(numberToCheck + " is odd ");
        }
    }
}
