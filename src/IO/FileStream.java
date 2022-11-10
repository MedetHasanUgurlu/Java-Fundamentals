package IO;

import Enumeration.Main;

import java.io.*;

public class FileStream {
    /*
     * Yüksek seviyeli karakter tabanlı Reader and Writer
     * Düşük seviyeli karakter  tabanlı InputStream and OutputStream
     *
     * Reader Writer Character
     * InputStream ve OutputStream Byte
     */
    public static void main(String[] args) throws IOException {
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure " +
                "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
                "anim id est laborum.";

        // Write string to txt int byte[]
        File file1 = new File("Text.txt");
        FileOutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(lorem.getBytes());
        // Read txt by one by
        FileInputStream inputStream = new FileInputStream(file1);
        int x = 0;
        while((x=inputStream.read())!=-1){
            System.out.print((char) x);
        }
        // Write the byte of string
        for (int i = 0; i < lorem.getBytes().length-1; i++) {
            System.out.println();
            int i1 = lorem.getBytes()[i];
            System.out.print(Integer.toBinaryString(i1));
        }



    }


}