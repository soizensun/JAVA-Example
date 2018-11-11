package L04_masterMind;

public class MasterMind {
    private int player1;
    private int player2;
    private int cDigit;
    private int cPosition;

    public MasterMind(int player1, int player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.cDigit = 0;
        this.cPosition = 0;
    }

    public int getPlayer1() {
        return player1;
    }

    public int getPlayer2() {
        return player2;
    }

    private void checkPosition(){
        // check correct position
        this.cPosition = 2;
    }


    private void checkDigit(){
        // check correct digit
        this.cDigit = 2;
    }

    public void check(){
        this.checkDigit();
        this.checkPosition();
        if (this.cPosition == 2 && this.cDigit == 2){
            System.out.println("Congratulations, you just mastered my mind!!");
        }
        else {
            System.out.println("Sorry!!!");
        }
    }
}
