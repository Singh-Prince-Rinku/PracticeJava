import java.util.Scanner;

public class WhichnumIsGreater {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("A is equal to B");
            } else {
                if (a > b) {
                    System.out.println("a is greater than b");
                } else if (a < b) {
                    System.out.println("a is smaller than b");

                }
            }
        }
    }
}
