package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        Scanner input = new Scanner(System.in);
        List<Integer> userList = new ArrayList<>();

        System.out.print("How many numbers will you enter: ");

        int numAmount = input.nextInt();

        for (int i = 1; i <= numAmount; i++) {
            System.out.printf("Enter the next number (%d/%d):", i, numAmount);
            int number = input.nextInt();
            userList.add(number);
        }
        System.out.println("Thanks...");

        return userList;
    }
}
