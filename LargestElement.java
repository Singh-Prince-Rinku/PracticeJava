static int findLargestElement(int[] arr) {
    int maxElement = arr[1];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > maxElement) {
            maxElement = arr[i];
        }
    }
    return maxElement;
}

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 3, 2, 3, 4, 55, 34, 23, 99 };
        int Element = findLargestElement(arr);
        System.out.println(Element);

    }
}
