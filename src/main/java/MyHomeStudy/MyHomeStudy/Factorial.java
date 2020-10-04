package MyHomeStudy.MyHomeStudy;

public class Factorial {
    public static int calc(int n) {
        int der = 1;
        for ( int index = 1; index <= n; index++) {
            der = der * index;
        }
        return der;
    }
}
