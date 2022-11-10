package IO;

import java.io.*;

public class Lab2 {
    // First declare your files
    // Then pipe the file, so we can react byte then write the target files
    public static void main(String[] args) throws IOException {
        File file = new File("Text.txt");
        File target = new File("Text2.txt");

        FileInputStream inputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream(target);
        int x =0;
        while((x=inputStream.read())!=-1){
            outputStream.write(x);
        }
    }
}
