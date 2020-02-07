package exporters;

import java.util.List;
import java.util.stream.Collectors;

public class ConsoleExporter implements NumberExporter{

    @Override
    public void export(List<Integer> numbers) {
        int length=numbers.size()+numbers.size();  //Border length
        for (int i=0 ; i<= length ; i++){
            System.out.print("*");  //Print top border
        }
        System.out.println();
        System.out.println("*"+numbers.stream().map(Object::toString).collect(Collectors.joining(","))+"*");  //Print numbers
        for (int i=0 ; i<= length ; i++){
            System.out.print("*");  //Print bottom border
        }
    }
}
