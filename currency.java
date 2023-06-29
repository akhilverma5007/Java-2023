//6. Input currency in rupees and output in USD.

import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rupee");
        float rupee = input.nextFloat();

        Double conversion = rupee * 0.012;
        System.out.println(rupee + " is " + conversion + " USD dollars. ");

    }
}
