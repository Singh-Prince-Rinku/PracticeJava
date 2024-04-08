public class CopyinArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = new int[a.length];
        for (int i = a.length-1, j=0;i >=0; i--,j++) {
            b[j] = a[i];
            System.out.print(b[j]);
        }
    }
}
