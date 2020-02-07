package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter
{
    @Override
    public void export(List<Integer> numbers)
    {
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print("***");
        }

        System.out.print("\n* ");

        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + ", ");
        }

        System.out.print("*\n");

        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print("***");
        }

    }
}
