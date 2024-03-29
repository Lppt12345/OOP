package T14.DesignPattern.Ex2;

import java.util.List;

public class BubbleSort implements Strategy {

    @Override
    public void sort(List<Integer> list) {
        System.out.print("Dung BB Sort: ");
        for (int i = 0; i <= list.size() - 2; i++) {
            boolean check = false;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    check = true;
                }
            }
            if (!check) break;
        }
    }
}
