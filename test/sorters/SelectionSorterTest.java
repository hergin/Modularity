package sorters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSorterTest {

    @Test
    void sort() {
        var exampleList = Arrays.asList(8, 6, 4, 2);
        var actual = new SelectionSorter().sort(exampleList);

        var expected = Arrays.asList(2, 4, 6, 8);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}