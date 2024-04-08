import java.util.Scanner;

public class Checking {
    public static void main(String args[]) {
        // for checking even or odd number by taking input from the user
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = num % 2;
            if (sum == 0) {
                System.out.println("Even number"); 
            } else {
                System.out.println("Odd number.");
            }
        }
    }
}