package exporters;

import sorters.NumberSorter;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        String line = "";
        String list = "*";
        for (int i = 0; i < numbers.size() - 1; i++) {
            list += numbers.get(i) + ",";
        }
        list = list + numbers.get(numbers.size() - 1) + "*";
        for (int j = 0; j < list.length(); j++) {
            line = line + "*";
        }

        System.out.println(line);
        System.out.println(list);
        System.out.println(line);
    }
}