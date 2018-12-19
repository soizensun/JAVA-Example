package Guessor;

// elab-source: Guessor

public class Guessor {
    private int target;

    public Guessor(int target) {
        this.target = target;
    }

    public String calaulate(int des){
        if(this.target > des){
            return "too low";
        }
        else if(this.target < des){
            return "too high";
        }
        else{
            return "correct";
        }
    }
}

