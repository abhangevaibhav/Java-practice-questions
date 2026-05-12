public class InvertedHalfPyramid {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5 - i + 1; k >= 1; k--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
