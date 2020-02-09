package sorters;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class SelectionSorterTest {

    @Test
    void sort(){
        var simulationArray = Arrays.asList(3, 3, 2, -1, 77, 1100);
        var actual = new SelectionSorter().sort(simulationArray);

        var expected = Arrays.asList(-1, 2, 3, 3, 77, 1100);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

}