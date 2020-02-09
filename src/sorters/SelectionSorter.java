package sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {
    @Override
    public List<Integer> sort(List<Integer> items) {
        var resultingList = new ArrayList<Integer>(items);

        for (int i = 0; i < resultingList.size() - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < resultingList.size(); j++) {
                if (resultingList.get(j) < resultingList.get(min_idx)) {
                    min_idx = j;
                    Collections.swap(resultingList, min_idx, i);
                }
            }
        }
        return resultingList;
    }
}
