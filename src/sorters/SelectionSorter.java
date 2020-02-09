package sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {
    @Override
    public List<Integer> sort(List<Integer> items) {
        var resultingList = new ArrayList<Integer>(items);
        for (int i = 0; i < resultingList.size(); i++){
            int index = i;
            for (int j = i + 1; j < resultingList.size(); j++){
                if (resultingList.get(j) < resultingList.get(index)) {
                    Collections.swap(resultingList, index, j);
                }
            }
        }
        return resultingList;
    }
}
