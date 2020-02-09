package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnotherProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        Scanner userInput = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        System.out.println("Enter how many numbers you will enter:");
        int numOfNums = userInput.nextInt();
        for (int i = 0; i < numOfNums; i++) {
            System.out.println("Enter how many number " + (i + 1) + "/" + numOfNums + ":");
            int numGiven = userInput.nextInt();
            result.add(numGiven);
        }

        return result;
    }
}
