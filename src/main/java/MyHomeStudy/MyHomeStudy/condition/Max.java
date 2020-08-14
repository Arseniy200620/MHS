package MyHomeStudy.MyHomeStudy.condition;

public class Max {
    public static String max(int Left, int Right) {
        String label = Left >= Right ? "is <1>" : "is <2>";
        return label;
    }
    public static void main(String[] args) {
        String msg = Max.max(20, 24);
        System.out.println(msg);
    }
}