public class cmdReverse {
    public static void main(String[] args) {
        int j,k;
        for( int i = 0; i < args.length; i++ ) {
            System.out.println("Your Number is :");
            j = Integer.parseInt(args[i]);
            System.out.print(j);
        }
        for(j=args.length-1; j>=0; j--){
            System.out.println("Reverse Number: ");
            k = Integer.parseInt(args[j]);
            System.out.print( k);
        }
    }
}
