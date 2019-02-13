package algolithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int pointer = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '[')  pointer = 0;
            else if (line.charAt(i) == ']') pointer = stringBuilder.length();
            else {
                stringBuilder.insert(pointer, line.charAt(i));
                pointer += 1;
            }
        }

        System.out.println(stringBuilder.toString());
    }
}