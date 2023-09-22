package kg_task_1;

public class Utils {
    public static int findMin(int[] array) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) result = array[i];
        }
        return result;
    }
}
