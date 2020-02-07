package sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {

    @Override
    public List<Integer> sort(List<Integer> items) {
        var resultingList = new ArrayList<Integer>(items);
        for (int i = 0; i < resultingList.size(); i++) {
            int min = resultingList.get(i);  //Assume a minimum number
            for (int j = i + 1; j < resultingList.size(); j++) {  //Compare it with other numbers
                if (resultingList.get(j) < min) {
                    min = resultingList.get(j);
                }
                if (min != resultingList.get(i)) {
                    Collections.swap(resultingList, i, j);  //If a smaller number is found than the original number, replace their position
                }
            }
        }
        return resultingList;
    }
}
