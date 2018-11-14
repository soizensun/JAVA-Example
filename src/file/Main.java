package file;

import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String sep = System.getProperty("file.separator");
        String cwd = System.getProperty("user.dir");
        Date date = new Date();

        try {
            FileWriter fileWriter = new FileWriter("test.txt",true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(date.toString() + " >>> " + cwd);
            writer.newLine();

            writer.close();

        } catch (IOException e) {
            System.err.println(e);
        }

        try {
            FileReader fileReader = new FileReader("test.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            String line = "";
            while ( (line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }


    }

}
