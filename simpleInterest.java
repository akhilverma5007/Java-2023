//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args){
        System.out.println("Simple Interest Program ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = input.nextInt();
        System.out.print("Enter time: ");
        int time = input.nextInt();
        System.out.print("Enter rate: ");
        float rate = input.nextFloat();
        float si = principal*rate*time / 100;
        System.out.println("Simple Interest is " + si);
    }
}
