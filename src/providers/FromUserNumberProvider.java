package providers;

import java.util.*;

public class FromUserNumberProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many numbers for array? ");
        int size = reader.nextInt();

        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            System.out.println("Enter next number ("+(i+1)+"/"+size+"): ");
            int element = reader.nextInt();
            list.add(i,element);
        }
        System.out.println("List is complete.");

        reader.close();
        return list;
    }
}
