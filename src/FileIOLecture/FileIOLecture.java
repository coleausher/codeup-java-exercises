package FileIOLecture;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.nio.charset.Charset;


import static java.nio.file.Files.readAllLines;
import static java.nio.file.Files.write;


public class FileIOLecture {
    public static void main(String[] args) throws IOException {

//1. build file path top data file
        // example path: "/src/data"
        String currentDirectory = System.getProperty("user.dir");
        String directory = currentDirectory + "/src/data";
        String fileName = "data.txt";
        Path filepath = Paths.get(directory, fileName);
//        System.out.println(filepath);

        // convert charset for UTF encoding for text file
        Charset charConvert = StandardCharsets.UTF_8;

// 2. check if file exists and is in correct directory if not create directory
        if (Files.notExists(Path.of(directory))) {
            Files.createDirectories(Path.of(directory));
        }
// 3. check if file exists, if not then create file
        if (! Files.exists(filepath)) {
            Files.createFile(filepath);
        }

// read from data file
        List<String> data = Files.readAllLines(filepath);
        System.out.println("Reading data file BEFORE writing new lines");
        for (int i = 0; i < data.size(); i += 1) {
            System.out.println((i + 1) + ": " + data.get(i));
        }

        // write to file
        List<String>  lines  = Arrays.asList("Test line 1", "Test line 2");
        System.out.println("Reading data file AFTER writing new lines");

        Files.write(filepath,
                lines,
                StandardOpenOption.APPEND);

        for (int i = 0; i < data.size(); i += 1) {
            System.out.println((i + 1) + ": " + data.get(i));
        }


//        Path Files.write(Path filepath, List<String> lines[, StandardOpenOption option]);


    }
  
}
