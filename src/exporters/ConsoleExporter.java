package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {

        for (int i : numbers) {
            System.out.print("**");
        }

        System.out.println();

        for (int i : numbers) {
            System.out.print(i + ",");
        }

        System.out.println();

        for (int i : numbers) {
            System.out.print("**");
        }
    }
}
