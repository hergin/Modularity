import exporters.ConsoleExporter;
import exporters.HTMLExporter;
import exporters.NumberExporter;
import providers.FromFileNumberProvider;
import providers.FromUserNumberProvider;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import sorters.BubbleSorter;
import sorters.NumberSorter;
import sorters.SelectionSorter;

import java.io.Console;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider theProvider = new FromUserNumberProvider(); //Replaced!

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new SelectionSorter(); //Replaced!
        var sortedNumbers = theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + sortedNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new ConsoleExporter(); //Replaced!
        theExporter.export(sortedNumbers);
    }
}
