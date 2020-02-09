package exporters;

import java.util.ArrayList;
import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        List<Integer> resultingList = new ArrayList<>();
        int n = resultingList.size();
        for (int i = 0; i < n + 2; i++) {
            System.out.println("*");
        }
        System.out.println();
        System.out.println("*" + resultingList + "*" );
        for (int i = 0; i < n + 2; i++) {
            System.out.println("*");
        }
        System.out.println();


    }
}
