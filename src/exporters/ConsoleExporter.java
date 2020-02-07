package exporters;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class ConsoleExporter implements NumberExporter {

    @Override
    public void export(List<Integer> numbers) {
        String asteriks = "";
        for(int i = 0; i>numbers.size();i++){
            asteriks = "***";

        }
        System.out.println(asteriks);
        System.out.println("*" + numbers + "*");
        System.out.println(asteriks);
    }
}
