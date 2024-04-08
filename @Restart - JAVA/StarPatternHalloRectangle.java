public class StarPatternHalloRectangle {
    public static void main(String[] args) {
        // outer loops run for each row
        for (int i = 1; i <= 5; i++) {
            // inner loops run for each column
            for (int java = 1; java <= 5; java++) {
                //target only boundary to print * 
                if (i == 1 || i == 5 || java == 1 || java == 5) {
                    System.out.print("*");
                } else {
                    // given space on empty place 
                    System.out.print(" ");
                }
            }
            // print * in next rows for this 
            System.out.println();
        }

    }
}