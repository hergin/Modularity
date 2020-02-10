import sorters.NumberSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {
    @Override
    public List<Integer> sort(List<Integer> items) {
        var newList = new ArrayList<Integer>(items);
        for (int i = 0; i < newList.size(); i++) {
            for( int j = i + 1; j < newList.size(); j++){
                if (newList.get(j) < newList.get(i)){
                    Collections.swap(newList,j,i);
                }
            }
        }
        return newList;
    }


}
