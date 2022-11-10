package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab {
    // FileReader read the file char by char
    public static void main(String[] args) throws IOException {
        File file = new File("Text.txt");
        FileReader fileReader = new FileReader(file);
        char[] buffer = new char[(int)file.length()];
        fileReader.read(buffer);
        System.out.println(new String(buffer));



    }
}
