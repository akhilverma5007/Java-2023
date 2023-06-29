import java.util.Scanner;
public class loweruppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'b'){
            System.out.println("Character is lowercase");
        }
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Character is uppercase");
        }
        else{
            System.out.println("You have input a non character input");
        }

    }
}
