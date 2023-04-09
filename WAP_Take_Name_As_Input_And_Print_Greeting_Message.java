//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class WAP_Take_Name_As_Input_And_Print_Greeting_Message
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Name ");
        String name = input.next();
        System.out.println("Hi " + name + "." + " You're welcomed here!");
    }
}
