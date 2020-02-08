package sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {

    @Override
    public List<Integer> sort(List<Integer> items) {
        var resultingList = new ArrayList<Integer>(items);
        for (int i = 0; i < resultingList.size(); i++) {
            for (int j = i+1; j < resultingList.size(); j++) {
                if (resultingList.get(j) < resultingList.get(i)) {
                    Collections.swap(resultingList, i, j);
                }
            }
        }
        return resultingList;
    }

}
