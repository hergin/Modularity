package sorters;

import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {


    @Override
    public List<Integer> sort(List<Integer> items) {
        for (int i=0; i < items.size(); i++){

            int min = 0;
            for (int j = i; j < items.size(); j++){
                if(items.get(j) < items.get(min)){
                    min = j;
                }

            }


            if(items.get(i) > items.get(min)) {
                Collections.swap(items, i, min);
            }

        }

        for (int i=0; i < items.size()-1; i++){
            Collections.swap(items,i,i+1);
        }

        return items;
    }
}
