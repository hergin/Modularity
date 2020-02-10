package sorters;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSorterTest {

    @Test
    void sort() {
        var exampleList = Arrays.asList(4, 3, 2, 1, 4, 6, 7, 8);
        var actual = new SelectionSorter().sort(exampleList);
        System.out.println(actual);
        var expected = Arrays.asList(1, 2, 3, 4, 4, 6, 7 ,8);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}