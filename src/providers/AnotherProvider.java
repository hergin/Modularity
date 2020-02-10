package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnotherProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int input = console.nextInt();
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < input; i++) {
            System.out.print("Enter the next number (" + (i + 1) + "/" + input + ") ");
            int newInt = console.nextInt();
            resultList.add(newInt);
        }
        return resultList;
    }
}
