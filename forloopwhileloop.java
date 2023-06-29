import java.util.Scanner;

public class forloopwhileloop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

//        FOR LOOP
        for (int n = 1; n <= num; n++) {
            System.out.print(n + " ");
        }


//        WHILE LOOP
//        int n = 1;
//        while(n <= num){
//            System.out.print(n + " ");
//            n++;
//        }

//        DO WHILE LOOP
//        int n = 1;
//        do {
//            System.out.print("Hello World!");
//        } while (n != 1);
    }
}
