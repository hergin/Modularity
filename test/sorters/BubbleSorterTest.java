package sorters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSorterTest {

    @Test
    void sort() {
        var exampleList = Arrays.asList(4, 3, 2, 1);
        var actual = new BubbleSorter().sort(exampleList);

        var expected = Arrays.asList(1, 2, 3, 4);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}