package providers;

import java.util.List;
import java.util.Scanner;

public class AnotherProvider implements NumberProvider{

    @Override
    public List<Integer> provideNumbers() {

        Scanner input = new Scanner(System.in);

        int X = 0;
        System.out.print("How many numbers will you enter: ");
        int number = input.nextInt();
        int i = 1;

        if(i<= number) {
            System.out.print("Enter number " + i + ":");
            i++;
        }
        else{
            return null;
        }

        provideNumbers().add(input.nextInt());

        return provideNumbers();
    }
}
