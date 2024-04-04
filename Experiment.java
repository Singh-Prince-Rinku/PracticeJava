public class Experiment {
    public static void main(String[] args) {
        // Declaring and initializing a 3D array
        int[][][] threeDArray = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} }
        };

        // Accessing and printing elements of the 3D array
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println(); // Move to next line after printing each row
            }
            System.out.println(); // Add an empty line after printing each 2D array
        }
    }
}
