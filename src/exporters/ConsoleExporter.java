package exporters;

import providers.NumberProvider;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        int starSum = 1;
        String stars = "";
        String numberProxy;

        for (int w = 0; w < numbers.size(); w++){
            numberProxy = String.valueOf(numbers.get(w));
            starSum += numberProxy.length() + 1;
        }
        for(int x = 0; x < starSum; x++){
            stars += "*";
        }

        System.out.print(stars + "\n*");
        String addOn = ",";
        for (int x = 0; x < numbers.size(); x++){
            if (x == numbers.size() - 1){
                addOn = "";
            }
            System.out.print(numbers.get(x) + addOn);
        }
        System.out.println("*\n" + stars);
    }
}
