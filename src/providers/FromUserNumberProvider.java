package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider  {
    @Override
    public List<Integer> provideNumbers() {

        List<Integer> numberList = new ArrayList<>();
        Scanner totalNumbersInput = new Scanner(System.in);
        System.out.println("Please enter how many numbers you will enter:" );
        int amountOfNumbers = (totalNumbersInput.nextInt());

        Scanner numbersInput = new Scanner(System.in);
        for (int i = 0; i < amountOfNumbers; i++)
        {
            int activeNumber = i +1;
            System.out.println("Please enter your next number ("+ activeNumber + "/"+ amountOfNumbers+") :");

            int element = numbersInput.nextInt();

            numberList.add(element);
        }

        return numberList;
    }
}
