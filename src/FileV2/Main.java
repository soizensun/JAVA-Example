package FileV2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String cwd = System.getProperty("user.dir");
        System.out.println("cwd => " + cwd);

        String sep = System.getProperty("file.separator");
        System.out.println("sep => " + sep);

        File newfile = new File("tess.txt");
        try {
            newfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter buffer = null;

        try {
            buffer = new BufferedWriter(new FileWriter(newfile, true));
            buffer.write( newfile.getPath() + " >> " + LocalDateTime.now());
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
