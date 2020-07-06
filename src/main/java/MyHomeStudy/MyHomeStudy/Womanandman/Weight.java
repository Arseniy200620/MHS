package MyHomeStudy.MyHomeStudy.Womanandman;

public class Weight {
    public static double manWeight(short height) {
        double rsm = (height - 100) * 1.15;
        return rsm;
    }
    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args) {
        short height = 187;
        double man = Weight.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = Weight.womanWeight(height);
        System.out.println("Woman 187 is " + woman);
    }
}
