package T02;

//elab-source:PianoController.java
import java.util.Scanner;

public class PianoController {
    private int round;
    private Scanner in;
    private String song;


    PianoController(int round) {
        this.round = round;
        in = new Scanner(System.in);
        this.song = "";
    }

    public void run(){

        for (int i = 0; i < round; i++) {
            String command = in.next();
            if(command.equals("Normal")){
                String node = in.next();
                int time = in.nextInt();
                NomalNode nodee = new NomalNode(node, time);
                song += nodee.printFormat();
            }
            else if(command.equals("Creative")){
                String node = in.next();
                int time = in.nextInt();
                CreativeNode nodee = new CreativeNode(node, time);
                song += nodee.printFormat();
            }
        }

    }

    public String getSong() {
        return song;
    }
}
