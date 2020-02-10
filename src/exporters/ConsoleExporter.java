package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter{

    @Override
    public void export(List<Integer> numbers) {
        System.out.println("********");
        System.out.println(numbers);
        System.out.println("********");
    }
}
