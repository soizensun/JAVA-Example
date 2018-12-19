package Hangman;

// elab-source: MainHangman.java
// elab-mainclass: MainHangman

import java.util.Scanner;

public class MainHangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        Hangman hangman = new Hangman(word);
        System.out.print(hangman.getLife() + " ");
        System.out.println(hangman.getResult());
        while (true){
            if(hangman.getLife() == 0){
                break;
            }
            if(!hangman.isWin()){
                String charactor = scanner.next();
                try {
                    hangman.check(charactor);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.print(hangman.getLife() + " ");
                System.out.println(hangman.getResult());
            }
            if(hangman.isWin()) break;
        }
        if(hangman.isWin()){
            System.out.println("Congratulations, you win");
        }
        else{
            System.out.println("You lose, the answer is " + hangman.getWord());
        }
    }
}
