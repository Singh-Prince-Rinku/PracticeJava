// Second largest element in an array
public class SecondLargetElement {
    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println(secondLargest);
    }
}
