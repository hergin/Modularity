import exporters.NumberExporter;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        var border = "";
        var line = "*";
        for (int i = 0; i < numbers.size() ; i++) {
            line += numbers.get(i) + ",";
        }

        line = line + numbers.get(numbers.size() - 1) + "*";
        for (int j = 0; j < line.length(); j++) {
            border = border + "*";
        }
        System.out.println(border);
        System.out.println(line);
        System.out.println(border);
    }
}

