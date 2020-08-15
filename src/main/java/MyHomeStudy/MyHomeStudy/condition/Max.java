package MyHomeStudy.MyHomeStudy.condition;

public class Max {
    public static int max(int Left, int Right) {
        int label = Left >= Right ? Left : Right;
        return label;
    }
    public static void main(String[] args) {
        int msg = Max.max(20, 24);
        System.out.println(msg);
    }
}