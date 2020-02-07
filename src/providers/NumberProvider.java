package providers;

import java.io.IOException;
import java.util.List;

public interface NumberProvider {
    List<Integer> provideNumbers() throws IOException;
}
