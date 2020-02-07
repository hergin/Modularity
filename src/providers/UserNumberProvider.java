package providers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserNumberProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        String stringNumber;
        int listLength;
        int listNumber;
        List<Integer> numberList = new ArrayList<>();
        try {
            System.out.println("How many numbers will be entered?");
            InputStreamReader systemReader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(systemReader);
            stringNumber = br.readLine();
            listLength = Integer.parseInt(stringNumber);
            for (int i = 0; i < listLength; i++) {
                String amount = String.format("Enter the next number (%d/%d)", i + 1, listLength);
                System.out.println(amount);
                systemReader = new InputStreamReader(System.in);
                br = new BufferedReader(systemReader);
                stringNumber = br.readLine();
                listNumber = Integer.parseInt(stringNumber);
                numberList.add(listNumber);
            }
            System.out.println("Thanks...");
        }
        catch (IOException ioe) {
            System.out.println("IO Exception raised!");
        }
        return numberList;
    }
}
