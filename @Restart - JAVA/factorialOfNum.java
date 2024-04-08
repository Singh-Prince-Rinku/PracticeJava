import java.util.Scanner;

// factorial number of any number
public class factorialOfNum {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            } else {
                long factorial = calculateFactorial(num);
                System.out.printf("The factorial of %d is: %d%n", num, factorial);
            }
        }
    }

    private static long calculateFactorial(int num) {
        long result = 1;
        long i = 2;

        while (i <= num) {
            result *= i;
            i++;
        }

        return result;
    }
}