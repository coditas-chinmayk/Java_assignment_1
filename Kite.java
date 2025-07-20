import java.util.Scanner;

public class Kite {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (integer please): ");
        int num = s.nextInt();

        // Top half
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < num - 1; j++) {
                System.out.print("*");
            }
            for (int j = i; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        s.close();
    }
    
}
