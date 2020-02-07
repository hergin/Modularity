package sorters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSorterTest
{
    @Test
    void sort() {
        var exampleList = Arrays.asList(7, 3, 8, 5);
        var actual = new SelectionSorter().sort(exampleList);

        var expected = Arrays.asList(3, 5, 7, 8);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
