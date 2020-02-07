package providers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FromUserNumberProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() throws IOException {
        List<Integer> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("How many numbers you will enter: ");  //Ask the user the size
                String answer = br.readLine();
                int size = Integer.parseInt(answer);  //Convert String to int
                for (int j = 1; j <= size; j++) {
                    System.out.println("Enter the next number (" + j + "/" + size + ")：");  //Ask the user number
                    String answernumber = br.readLine();
                    int number = Integer.parseInt(answernumber);  //Convert String to int
                    result.add(number);  //Add number to the list
                }
                System.out.println("Thanks...");
                break;
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        return result;
    }
}
