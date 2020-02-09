package providers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class AmountOfNumbersProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        List<Integer> list = new LinkedList<>();
        System.out.println("Please enter the the desired amount of numbers: ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int amount = Integer.valueOf(br.readLine());
            int amountHolder = amount;
            int counter = 0;
            while (amount > 0){
                counter += 1;
                System.out.println("Enter number "+ counter + "/" + amountHolder + ":");
                list.add(Integer.valueOf(br.readLine()));
                amount--;
            }
        }catch (IOException e){
            System.out.println("Error: IOException");
        }
        return list;
    }
}
