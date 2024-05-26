import java.util.Scanner;

public class TablebyUser {
        public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbere");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            sum = number * i;
            System.out.println(sum);
        }
        sc.close();
    }
}
