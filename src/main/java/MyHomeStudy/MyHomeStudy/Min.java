package MyHomeStudy.MyHomeStudy;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            } else {

            }
        }
        return min;
    }
}
