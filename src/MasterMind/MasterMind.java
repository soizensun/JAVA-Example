package MasterMind;

// elab-source: MasterMind.java

public class MasterMind {
    private String player1;
    private String player2;
    private int cPosition;
    private int cDigit;
    private String promt;

    public MasterMind(int player1, int player2) {
        this.player1 = player1 + "";
        this.player2 = player2 + "";
        this.promt = "";
        this.cPosition = 0;
        this.cDigit = 0;
    }

    public int getcDigit() {
        return cDigit;
    }

    public String getPromt() {
        return promt;
    }

    public int getcPosition() {
        return cPosition;
    }

    public void checkPostiton(){
        for (int i = 0; i < 4; i++) {
            if(this.player1.charAt(i) == this.player2.charAt(i)){
                cPosition += 1;
            }
        }
    }

    public void checkDigit(){
        for (int i = 0; i < 4; i++) {
            if(this.player2.contains(this.player1.charAt(i) + "") ){
                cDigit += 1;
            }
        }
    }

    public void checkAll(){
        this.checkPostiton();
        this.checkDigit();
        if(this.cDigit == this.cPosition){
            if(this.cDigit != 0 && this.cPosition != 0)
                this.promt = "Congratulations, you just mastered my mind!!";
            else this.promt = this.cDigit + " " + this.cPosition;
        }
        else{
            this.promt = this.cDigit + " " + this.cPosition;
        }
    }


}
