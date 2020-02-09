package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++){
            System.out.println("*");
        }
        System.out.println("\n*");

        for (int i = 0; i < numbers.size(); i++) {
            if (i < numbers.size() - 1) {
                System.out.println(numbers.get(i) + ", ");
            }
            else {
                System.out.println(numbers.get(i));
            }
        }
        System.out.println("*\n");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("*");
        }


    }
}
