package T11;

import java.util.List;

public class Week11<T extends Comparable> {

    /**
     * Ham.
     *
     * @param arr mang.
     * @return mang.
     */
    public static <T extends Comparable> List<T> sortGeneric(List<T> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j).compareTo(arr.get(i)) < 0) {
                    T tmp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, tmp);
                }
            }
        }
        return arr;
    }

}
