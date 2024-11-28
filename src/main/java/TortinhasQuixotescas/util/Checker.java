package TortinhasQuixotescas.util;

public class Checker {
    public static <T extends Comparable<T>> Boolean isArrayOrdered(T[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 1].compareTo(array[i]) < 0) {
                return false;
            }
        }
        return true;
    }
}
