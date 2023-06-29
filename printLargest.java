//5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class printLargest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("Type two numbers to compare which one is greater.");
//        System.out.print("Enter First number : ");
//        int num1 = input.nextInt();
//        System.out.print("Enter Second number : ");
//        int num2 = input.nextInt();
//
//        if(num1<num2){
//            System.out.println(num2 + " is greater.");
//        }
//        else if(num1>num2){
//            System.out.println(num1 + " is greater.");
//        }else{
//            System.out.println("They are equal");
//        }
        System.out.println("Enter three numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

//        int max = num1;
//        if(num2 > max){
//            max = num2;
//        }
//        if(num3 > max){
//            max = num3;
//        }
//        System.out.println(max);

        int max = Math.max(num3, Math.max(num1, num2));
//      System.out.println(Math.max(num1, num2));
        System.out.println(max);
    }
}
