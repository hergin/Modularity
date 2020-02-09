package sorters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSorterTest {

    @Test
    void sort(){
        var testList = Arrays.asList(12, 9, 21, 18);
        var actual = new SelectionSorter().sort(testList);

        var expected = Arrays.asList(9, 12, 18, 21);
        assertArrayEquals(expected.toArray(), actual.toArray());




    }


}
