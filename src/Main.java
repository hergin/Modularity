import exporters.ConsoleExporter;
import exporters.HTMLExporter;
import exporters.NumberExporter;
import providers.AnotherProvider;
import providers.FromFileNumberProvider;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import sorters.BubbleSorter;
import sorters.NumberSorter;
import sorters.SelectionSorter;

import java.util.Collections;
import java.util.concurrent.CompletionService;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        AnotherProvider theProvider = new AnotherProvider();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new SelectionSorter();
        var sortedNumbers = theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + sortedNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        ConsoleExporter theExporter = new ConsoleExporter();
        theExporter.export(sortedNumbers);

    }
}
