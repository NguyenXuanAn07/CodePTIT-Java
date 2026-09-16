import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HELLOFILE {
    public static void main(String[] args){
        try {
            List<String> content = Files.readAllLines(Paths.get("Hello"));

            System.out.println(content);
        } catch (IOException e) {
            System.out.println("No one file available");
        }
    }
}
