package exporters;

import java.util.List;
import java.util.stream.Collectors;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() * 3; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("* " + numbers.stream().map(Object::toString).collect(Collectors.joining(",")) + " *");
        for (int i = 0; i < numbers.size() * 3; i++) {
            System.out.print("*");
        }
    }
}
