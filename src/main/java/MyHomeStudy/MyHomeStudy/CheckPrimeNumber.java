package MyHomeStudy.MyHomeStudy;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int a = 2; (number % a) == 0; a++) {
       if (a <= (number / 2)) {
                prime = false;
                break;
           }
        }
        return prime;

    }
}