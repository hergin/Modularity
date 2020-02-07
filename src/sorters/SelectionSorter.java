package sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter
{

    @Override
    public List<Integer> sort(List<Integer> items)
    {
        var resultingList = new ArrayList<Integer>(items);
        int minValue;

        for (int i = 0; i < resultingList.size(); i++)
        {
            minValue = i;
            for (int j = i+1; j < resultingList.size(); j++)
            {
                if(resultingList.get(minValue) > resultingList.get(j))
                {
                    minValue = j;
                }
            }
            Collections.swap(resultingList, i, minValue);
        }

        return(resultingList);
    }
}
