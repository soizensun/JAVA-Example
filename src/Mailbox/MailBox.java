package Mailbox;

public class MailBox {
    private int[] letter;

    public MailBox() {
        this.letter = new int[120];
    }

    public int showLetter(int r) throws Exception{
        int index = r - 10 - 14000;
        if(index < 0 || index > 119){
            throw new Exception("Invalid Room Number");
        }
        else{
            return this.letter[index];
        }
    }

    public void setLetter(int r, int i) throws Exception {
        int index = r - 10 - 14000;
        if(index < 0 || index > 119){
            throw new Exception("Invalid Room Number");
        }
        else{
            this.letter[index] += i;
        }

    }

    public void getLetter(int r) throws Exception {
        int rr = r;
        int index = r - 10 - 14000;
        if(this.letter[index] == 0){
            throw new Exception("Not Found Mail in Room " + rr);
        }
        this.letter[index] = 0;
    }
}
