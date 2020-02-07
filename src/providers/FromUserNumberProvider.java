package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider
{

    @Override
    public List<Integer> provideNumbers()
    {
        List<Integer> resultingList = new ArrayList<>();

        Scanner amountOfNumbersInput = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter? ");
        int amountOfNumbers = (amountOfNumbersInput.nextInt());

        Scanner numbersInput = new Scanner(System.in);

        for (int i = 0; i < amountOfNumbers; i++)
        {
            System.out.println("Please each number in order: ");

            int element = numbersInput.nextInt();

            resultingList.add(element);
        }

        return(resultingList);
    }
}
