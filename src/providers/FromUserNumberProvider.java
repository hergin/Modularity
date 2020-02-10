package providers;

import sorters.NumberSorter;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers will you enter");
        int input = console.nextInt();
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < input; i++) {
            System.out.println("Enter the next number " + (i + 1) + "/" + input);
            int newInt = console.nextInt();
            resultList.add(newInt);
        }
        return resultList;

    }


}


