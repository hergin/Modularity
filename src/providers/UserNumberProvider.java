package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserNumberProvider implements NumberProvider {
@Override
    public List<Integer> provideNumbers() {
        List<Integer> resultingList = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        int numAmount = (console.nextInt());
        Scanner secondConsole = new Scanner(System.in);
        for (int i = 0; i < numAmount; i++) {
            int activeNum = i + 1;
            System.out.println("Please enter your next number ("
                    + activeNum + "/" + numAmount + "): ");
            int elem = secondConsole.nextInt();
            resultingList.add(elem);
        }

        return resultingList;
    }
}
