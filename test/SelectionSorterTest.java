import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSorterTest {

    @Test
    void sort() {
        var exampleList = Arrays.asList(4, 1, 5, 6, 2, 9, 4);
        var actual = new SelectionSorter().sort(exampleList);

        var expectedList = Arrays.asList(1, 2, 4, 4,5, 6, 9);
        assertArrayEquals(expectedList.toArray(), actual.toArray());
    }
}