import java.util.*;

public class FindEvenNumber {
    public static void main(String[] args) {
        // check even number from user input
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = num % 2;
            if (sum == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }
    }
}
