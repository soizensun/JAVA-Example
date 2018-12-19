package file;

import java.io.*;
import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args) {

        String cwd = System.getProperty("user.dir"); // return current working directory

        String sep = System.getProperty("file.separator"); // each os is not the same sep

//        String path =

        /*
        * file status method
        *
        * .exist()
        * .isFile()
        * .isDirectory()
        * .isHidden()
        *
        * */

        File jarDir = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String p = jarDir.getParentFile().getAbsolutePath();

        File newdir = new File(p + sep + "fileTextDir");
        newdir.mkdir();

        File newfile = new File(p + sep + "fileTextDir" + sep + "Test.txt");

//        for (String filename : newdir.list) {
//
//        }

        try {
            if(newfile.createNewFile()){
//                System.out.println(newfile.getAbsolutePath());
                System.out.println("Create file complete");
            }
            else{
                System.out.println("Your file is duplicate");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
//            FileWriter fileWriter = new FileWriter(newfile);
            BufferedWriter buffer = new BufferedWriter(new FileWriter(newfile, true));
            buffer.write( newfile.getPath() + " >> " + LocalDateTime.now());
            buffer.newLine();

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader buffet = new BufferedReader(new FileReader(newfile));
            String line = "";
            while((line = buffet.readLine()) != null){
                System.out.println(line);
            }
            buffet.close();
        } catch (FileNotFoundException e) { // FileNotFount is sub IOException class
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
