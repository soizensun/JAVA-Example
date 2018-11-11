package fileIO;

import collection.Student;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            FileReader inReader = new FileReader("src/fileIO/test.txt");
            BufferedReader buffer = new BufferedReader(inReader);
            String line;
            Subject introcom;
            String name;

            while ((line = buffer.readLine()) != null) {
                String s = line;
                String[] sub = s.split(", ");
//                for (String ss : sub) {
//                    System.out.println(ss);
//                }
                System.out.println("subject name : " + sub[1]);

                System.out.println("code : " + sub[2]);
                System.out.println("credit : " + sub[3]);
                System.out.println("type : " + sub[4]);
                System.out.println("level : " + sub[5]);

                introcom = new Subject(sub[1], sub[2], Integer.parseInt(sub[3]), sub[4], Integer.parseInt(sub[5]) );

                System.out.println(introcom.toString());

            }


    }


}
