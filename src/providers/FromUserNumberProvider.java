package providers;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider {


    @Override
    public List<Integer> provideNumbers() {

        var resultingList = new ArrayList<Integer>(provideNumbers());
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you will enter: ");
        int count = input.nextInt();
        for(int i = 0; i >= count; i++){
            System.out.println("Enter the next number" + "(" + i + "/" + count + ")");
            int num = input.nextInt();
            resultingList.add(num);

        }
        return resultingList;


    }
}
