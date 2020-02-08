package exporters;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleExporter implements NumberExporter{

    @Override
    public void export(List<Integer> numbers) {
        List<Integer> numberList = new ArrayList<>();
        String star = "*";
        String temp = "";

        for (var number : numbers){
            numberList.add(number);
            temp = temp + star;
        }

        System.out.println(temp);
        System.out.println("*" + numberList.toString() + "*");
        System.out.println(temp);
    }
}