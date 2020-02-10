package sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {
    @Override
    public List<Integer> sort(List<Integer> items) {
        var resultList = new ArrayList<Integer>(items);
        for (int i = 0; i < resultList.size(); i++) {
            for (int j = i + 1; j < resultList.size(); j++) {
                if (resultList.get(j) < resultList.get(i)) {
                    Collections.swap(resultList, j, i);
                }
            }

        }
        return resultList;

    }

}
