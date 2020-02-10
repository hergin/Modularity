import providers.NumberProvider;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider {
    Scanner console = new Scanner(System.in);
    @Override
    public List<Integer> provideNumbers() {
        List<Integer> newNumberList = new ArrayList<>();
        System.out.println("How many numbers will you enter: ");
        int input = console.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println("Enter the next number " + (i + 1) + "/"+ input+ ":");
            int newInt = console.nextInt();
            newNumberList.add(newInt);
        }
        return newNumberList;
    }
}
