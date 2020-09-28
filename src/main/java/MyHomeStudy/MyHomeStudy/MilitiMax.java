package MyHomeStudy.MyHomeStudy;
public class MilitiMax {
    public static int max(int first, int second, int third) {
        boolean a = (first > second ? first:second) > third;
        int result = a ? (first > second ? first:second):third;
        return result;
    }
}
