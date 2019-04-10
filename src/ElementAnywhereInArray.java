import java.util.Arrays;

public class ElementAnywhereInArray {
    public static void main(String[] args) {
        int[] array = { 10, 20, 40, 50 };
        int idx = 1;

        array = Arrays.copyOf(array, array.length + 1);
        System.arraycopy(array, idx, array, idx + 1, array.length - idx - 1);
        array[idx] = 30;
    }
}
