package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserNumberProvider implements NumberProvider {

    public UserNumberProvider(long nanoTime) {

    }

    @Override
    public List<Integer> provideNumbers() {
        List<Integer> resultingList = new ArrayList<>();
        int number;
        int temp;

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you enter: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println("Enter the next number (" + i + "/" + number + "): ");
            temp = input.nextInt();
            resultingList.add(temp);
        }
        return resultingList;
    }
}
