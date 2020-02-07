package exporters;

import java.util.List;
import java.util.stream.Collectors;

public class ConsoleExporter implements NumberExporter{

    @Override
    public void export(List<Integer> numbers) {
        int LengthOfNumbers =0;

        for (int j=0 ; j< numbers.size() ; j++){
            LengthOfNumbers += (numbers.get(j)+"").length();  //Calculate the sum of the digits of each number
        }

        int TotalLength=LengthOfNumbers+numbers.size();  //Calculate border length

        for (int i=0 ; i<= TotalLength ; i++){
            System.out.print("*");  //Print top border
        }
        System.out.println();
        System.out.println("*"+numbers.stream().map(Object::toString).collect(Collectors.joining(","))+"*");  //Print numbers
        for (int i=0 ; i<= TotalLength ; i++){
            System.out.print("*");  //Print bottom border
        }
    }
}
