package algolithm;

import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prompt = scanner.next();

        int count1 = 0, count2 = 0, count3 = 0;

        for (int i = 0; i < prompt.length(); i++) {
            if (prompt.charAt(i) == '(') { count1++; }
            else if (prompt.charAt(i) == ')') { count1--; }

            if (prompt.charAt(i) == '[') { count2++; }
            else if (prompt.charAt(i) == ']') { count2--; }

            if (prompt.charAt(i) == '{') { count3++; }
            else if (prompt.charAt(i) == '}') { count3--; }
        }

        if (count1 != 0 || count2 != 0 || count3 != 0) { System.out.println("false"); }
        else { System.out.println("true"); }
    }
}
