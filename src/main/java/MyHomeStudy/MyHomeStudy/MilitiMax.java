package MyHomeStudy.MyHomeStudy;
public class MilitiMax {
    public static int max(int first, int second, int third) {
        int result = (first > second ? first:second) > third ? (first > second ? first:second):third;
        return result;
    }
}
