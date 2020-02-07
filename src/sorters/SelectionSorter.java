package sorters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter{

    @Override
    public List<Integer> sort(List<Integer> items) {
        var sortedList = new ArrayList<>(items);
        for (int i = 0; i < sortedList.size(); i++) {
            for (int j = i; j < sortedList.size(); j++) {
                if (sortedList.get(j) < sortedList.get(i)) {
                    Collections.swap(sortedList, i, j);
                }
            }
        }
        return sortedList;
    }
}
