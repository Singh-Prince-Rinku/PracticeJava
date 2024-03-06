public class AvarageNumber {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Average Number is:" + sum / args.length);
    }
}
