package providers;

import sorters.NumberSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many numbers would you like to sort: ");
        int numberOfNumbers = keyboard.nextInt();
        List<Integer> sortableList = new ArrayList<>(numberOfNumbers);
        for (int k = 0; k < numberOfNumbers; k++){
            System.out.printf("Number %d: ", k+1);
            int nextNumber = keyboard.nextInt();
            sortableList.add(k,nextNumber);
        }
        return sortableList;
    }
}
