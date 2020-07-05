package MyHomeStudy.condition;

public class Point {
    public static double square(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        double result = Point.square(6, 2);
        System.out.println( "a = 6, b = 2, S = 2, real = " + result);
    }
}
