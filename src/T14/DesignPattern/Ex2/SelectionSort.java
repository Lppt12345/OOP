package T14.DesignPattern.Ex2;

import java.util.List;

public class SelectionSort implements Strategy{
    @Override
    public void sort(List<Integer> list) {
        System.out.print("Dung Selection Sort: ");
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(j) < list.get(min)) min = j;
            if (min != i) {
                int temp = list.get(min);
                list.set(min, list.get(i));
                list.set(i, temp);
            }
        }
    }
}
