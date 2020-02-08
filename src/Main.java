import exporters.ConsoleExporter;
import exporters.NumberExporter;
import providers.AmountOfNumbersProvider;
import providers.NumberProvider;
import sorters.NumberSorter;
import sorters.SelectionSorter;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider AmountOfNumbersProvider = new AmountOfNumbersProvider();

        var theNumbers = AmountOfNumbersProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new SelectionSorter();
        var sortedNumbers = theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + sortedNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new ConsoleExporter();
        theExporter.export(sortedNumbers);
    }
}