package providers;

import java.util.*;

public class FromUserNumberProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
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
