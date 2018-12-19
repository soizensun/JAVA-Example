package cashRegisterObserverParrern;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileObserver implements Observer{

    @Override
    public void update(double purchase) {
        CashRegister cashRegister = new CashRegister();

        String cwd = System.getProperty("user.dir"); // return current working directory
        String sep = System.getProperty("file.separator"); // each os is not the same sep

        File jarDir = new File(FileObserver.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String p = jarDir.getParentFile().getAbsolutePath();
        File newdir = new File(p + sep + "6010405092Folder");
        newdir.mkdir();
        File newFile = new File(p + sep + "6010405092Folder" + sep + "6010405092.txt");

        try {
            if(newFile.createNewFile()){
                System.out.println("create file sucess");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter buffer = null;
        try {
            buffer = new BufferedWriter(new FileWriter(newFile, true));
//            System.out.println(cashRegister.getPurchase());
            buffer.write((int) purchase + "");
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
