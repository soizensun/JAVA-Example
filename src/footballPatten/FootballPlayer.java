package footballPatten;

import java.util.ArrayList;

public class FootballPlayer {
    private String name;
    private int number;
    private String position;


    public FootballPlayer(String name, int number, String position) {
        this.name = name;
        this.number = number;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "| " + name + " |";
    }
}
