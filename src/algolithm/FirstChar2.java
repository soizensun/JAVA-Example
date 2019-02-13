package algolithm;

import java.util.HashMap;
import java.util.Scanner;

public class FirstChar2 {
    public static void main(String[] args) {
        char a = 0;
        int b = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String prompt = scanner.next();

        for (int i = 0; i < prompt.length(); i++) {
            if (hashMap.get(prompt.charAt(i)) == null) {
                hashMap.put(prompt.charAt(i), 1);
            } else {
                int n = hashMap.get(prompt.charAt(i));
                hashMap.put(prompt.charAt(i), ++n);
            }
        }
        for (Character c : hashMap.keySet()) {
            if (b == 0) {
                a = c;
                b = hashMap.get(c);
            } else {
                if (hashMap.get(c) < b) {
                    a = c;
                    b = hashMap.get(c);
                }
            }
        }

        System.out.println(a);
    }
}