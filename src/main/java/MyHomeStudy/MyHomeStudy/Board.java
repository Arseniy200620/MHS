package MyHomeStudy.MyHomeStudy;

public class Board {
    public static void paint(int width, int height) {
        for ( int indexW = 1; indexW <= width; indexW++  ) {
            for ( int indexH = 1; indexH <= height; indexH++ ) {
                int sum = indexH + indexW;

                if (sum % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(7, 7);
    }
}
