package file;

import java.io.*;

public class ObjectIOMain {
    public static void main(String[] args) {
        Vocabulary vocabulary = new Vocabulary("sad", "v", "sad", "I am sad");
        Vocabulary vocabulary1 = new Vocabulary("rrrrrrrrrrrrrrrrr", "v", "sad", "I am sad");

        FileOutputStream fileOS = null;
        try {
            fileOS = new FileOutputStream("testIOObject");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            ObjectOutputStream out = new ObjectOutputStream(fileOS);
            out.writeObject(vocabulary);
            out.writeObject(vocabulary1);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileInputStream filein = null;

        try {
            filein = new FileInputStream("testIOObject");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream in = new ObjectInputStream(filein);
            Vocabulary vv , vv1, vv2;
//            vv =  (Vocabulary) in.readObject();
//            vv1 = (Vocabulary) in.readObject();
//            vv2 = (Vocabulary) in.readObject();

            while((vv = (Vocabulary) in.readObject()) != null){
                System.out.println(vv);
            }

            System.out.println(vv);
//            System.out.println(vv1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
