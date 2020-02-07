package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {

    @Override
    public void export(List<Integer> numbers) {
        System.out.println(amountOfAsterisks(numbers));
        System.out.println("*" + numbers.toString() + "*");
        System.out.println(amountOfAsterisks(numbers));
    }

    private String amountOfAsterisks(List<Integer> numbers) {
        int lengthOfStringInConsole = numbers.toString().length() + 1;
        String asterisks = "*";
        for (int i = 0; i < lengthOfStringInConsole; i++) {
            asterisks +="*";
        }
        return asterisks;
    }
}
