package GameCharacter;

import java.util.Map;
import java.util.TreeMap;

public class GameCharacter {
    private String name;
    private int hp;
    private float damage;
    private float defense;
    private float money;
    private int level;
    private int exp;
    private Map<String , Integer> item = new TreeMap<>();

    public GameCharacter() {
    }

    public void recieveItems(String item, int quantity){
        
    }
}
