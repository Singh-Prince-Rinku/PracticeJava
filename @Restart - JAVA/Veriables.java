import java.util.*;

public class Veriables {
    public static void main(String args[]) {
        // Airthematic operators in java
        int a = 10;
        int b = 5;
        System.out.println((a * b) / (a - b));

        try (// input method in java
                Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine(); // we can also user next int for integers and nextflot for floating point any
                                         // many more
            System.out.println(name);
        }
    }
}
