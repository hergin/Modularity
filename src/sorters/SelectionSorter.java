package sorters;

import java.util.*;

public class SelectionSorter implements NumberSorter
{
    @Override
    public List<Integer> sort(List<Integer> items) {
        for (int i = 0; i < items.size(); i++) {
            int minIndex = 0;
            int minValue = items.get(i);
            for (int j = i; j < items.size(); j++) {
                if (items.get(j) <= minValue) {
                    minIndex = j;
                    minValue = items.get(j);
                }
            }
            if (minValue <= items.get(i)) {
                Collections.swap(items, minIndex, i);
            }
        }
        return items;
    }
}
