package L5task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    public static String readFromFile(String filePath) {
        String content=null;
        try {
            content = Files.readString(Path.of(filePath));


        } catch (IOException e) {
            System.out.println("problem with reading a file!! "  );

        }
        return content;
    }
}
