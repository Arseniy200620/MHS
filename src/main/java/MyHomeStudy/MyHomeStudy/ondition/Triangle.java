package MyHomeStudy.MyHomeStudy.ondition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean Exist = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        return Exist;
    }
}
