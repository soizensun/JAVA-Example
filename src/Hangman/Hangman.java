package Hangman;

// elab-source: Hangman.java

public class Hangman {
    private int life;
    private String word;
    private String keeper;
    private String result;

    public Hangman(String word) {
        this.life = 6;
        this.word = word;
        this.keeper = "";
        this.result = "";
        for (int i = 0; i < word.length(); i++) {
            this.result += "-";
        }
    }

    public String getWord() {
        return word;
    }

    public int getLife() {
        return life;
    }

    public String getResult() {
        return result;
    }

    public void check(String cha) throws Exception {
        char charecter = cha.charAt(0);
        if(this.keeper.contains(charecter + "")){
            throw new Exception("Duplicate character!!!!!");
        }
        String temp  = "";
        boolean isContain = false;
        this.keeper += keeper;
        for (int i = 0; i < this.word.length(); i++) {
            if(charecter == this.word.charAt(i)){
                temp += charecter;
                isContain = true;
            }
            else{
                temp += this.result.charAt(i);
            }
        }
        if(!isContain) this.life--;
        this.result = temp;
    }

    public boolean isWin(){
        if(!result.contains("-")){
            return true;
        }
        return false;
    }
}
