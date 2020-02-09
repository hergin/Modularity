package sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {
    @Override
    public List<Integer> sort(List<Integer> items) {
        var resultList = new ArrayList<Integer>(items);
        int minValue;

        for (int i = 0; i < resultList.size(); i++)
        {
            minValue = i;
            for (int j = i+1; j < resultList.size(); j++)
            {
                if(resultList.get(minValue) > resultList.get(j))
                {
                    minValue = j;
                }
            }
            Collections.swap(resultList, i, minValue);
        }

        return resultList;
    }
}
