package T14.DesignPattern.Ex2;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new BubbleSort());
        List<Integer> list = new ArrayList<>(List.of(1,4,5,6,7,1,2,3,9));
        context.sortStrategy(list);
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>(List.of(1,4,5,6,7,1,2,3,9));
        Context context2 = new Context(new SelectionSort());
        context2.sortStrategy(list2);
        System.out.println(list2);
    }
}
