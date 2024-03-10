import java.util.*;

class Deposite {
    int amount = 1000;
    int leftAmount;
    @SuppressWarnings("resource")
    void deposite() {
        Scanner sc = new Scanner(System.in);
        int depo = sc.nextInt();
        amount = amount + depo;
        System.out.println("your Total balance is " + amount);

    }
}

class message extends Deposite {
    @SuppressWarnings("resource")
    void Message() {
        System.out.println("If you want to withdraw Please Press 1 for conformation:");
        Scanner sc = new Scanner(System.in);
        int mess = sc.nextInt();
        if (mess == 1) {
            System.out.println("Your Withdrawal is Confirmed");
        }

    }
}
class Withdrawal extends message{
    @SuppressWarnings("resource")
    void withdraw() {
        System.out.println("Please Enter your amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        int with = sc.nextInt();
        leftAmount = amount - with;
        System.out.println("Amount withdraw successfully");

    }
}
class left extends Withdrawal{
    void leftA() {
        System.out.println("Your left amount is " + leftAmount);
    }
}

public class BankProcess {
    public static void main(String[] args) {

        System.out.println("Please Enter your Amount that you want to deposite:");
        left w = new left();
        w.deposite();
        w.Message();
        w.withdraw();
        w.leftA();
    }
}
