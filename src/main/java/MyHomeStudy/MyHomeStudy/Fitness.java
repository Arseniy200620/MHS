package MyHomeStudy.MyHomeStudy;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;

        while (ivan < nik) {
            month++;
            ivan *= 3;
            nik += nik;
        }

        return month;
    }

}
