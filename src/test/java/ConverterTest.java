import static MyHomeStudy.MyHomeStudy.converter.Converter.rubleToDollar;
import static MyHomeStudy.MyHomeStudy.converter.Converter.rubleToEuro;

public class ConverterTest {
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int ind = 120;
        int expectedd = 2;
        int outd = rubleToDollar(ind);
        boolean passedD = expectedd == outd;
        System.out.println("120 rubles are 2. Test result : " + passedD);
    }
}
