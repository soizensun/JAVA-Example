package L05_hangMan;

public class HangMan {
    private String word;
    private int life;
    private String result;
    private String keeper;


    public HangMan(String word, int life) {
        this.word = word;
        this.life = life;
        this.result = "";
        this.keeper = "";
        for (int i = 0; i < this.word.length(); i++){
            this.result += '-';
        }
    }

    public int showAmount(){
        return this.word.length();
    }

    public boolean check(char charector) throws Exception{
        if(this.keeper.contains("" + charector)){ // to check charactor
            throw new Exception("Duplicate charactor");
        }
        String temp = "";
        boolean isContain = false;
        this.keeper += charector;
         for (int i = 0; i < this.word.length(); i++){
             if (this.word.charAt(i) == charector){
                 temp += charector;
                 isContain = true;
             } else {
                 temp += this.result.charAt(i);
             }
         }
         if (!isContain) this.life--;
         this.result = temp;
         return isContain;
    }

    public int getLife() {
        return life;
    }

    public String getResult() {
        return result;
    }
}
