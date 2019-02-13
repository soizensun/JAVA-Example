package algolithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class  FirstChar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = 100000 ;
        char result = ' ' ;
        String s = scanner.nextLine();

        ArrayList<Character> list = new ArrayList<Character>();
        ArrayList<Character> checkChar = new ArrayList<Character>();
        for (int i = 0 ; i <= s.length()-1; i++) {
            list.add(s.charAt(i)) ;
        }
        for (Character c: list) {
            if (!checkChar.contains(c)) {
                checkChar.add(c) ;
                if (Collections.frequency(list, c) < limit) {
                    limit = Collections.frequency(list, c) ;
                    result = c ;
                }
            }
        }
        System.out.println(result);
    }
}