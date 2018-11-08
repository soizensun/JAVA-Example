package fileIO;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            FileReader inReader = new FileReader("src/fileIO/test.txt");
            BufferedReader buffer = new BufferedReader(inReader);
            String line;
            Subject introcom;
            while ((line = buffer.readLine()) != null) {
//                System.out.println(line);
                String s = line;
                String[] sub = s.split(",");
//                for (String ss : sub) {
//                    System.out.println(ss);
//                }
                System.out.println(sub[1]);

            }
    }
}
