package sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort implements NumberSorter{

    @Override
    public List<Integer> sort(List<Integer> items) {
        var ResultingList1 = new ArrayList<Integer>(items);

        int min = ResultingList1.get(0);
        for(int k: ResultingList1){
            min = min < k ? min :k;
        }

        for (int i = 0; i < ResultingList1.size(); i++) {
            for (int j = i+1; j < ResultingList1.size(); j++) {
                if(ResultingList1.get(j) < ResultingList1.get(i)){
                    Collections.swap(ResultingList1, i, j);
                }
                if(ResultingList1.get(i) < ResultingList1.get(j)){
                    if(ResultingList1.get(j) > ResultingList1.get(min)){
                        Collections.swap(ResultingList1, j, min);
                    }
                }

            }

        }
        return ResultingList1;
    }
}
