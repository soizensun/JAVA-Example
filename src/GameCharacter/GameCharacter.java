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
    private Map<String, Integer> skill = new TreeMap<>();

    public GameCharacter(String name) {
        this.money = 1000;
        this.name = name;
        this.hp = 1000;
        this.damage = 100;
        this.defense = 100;
        this.level = 1;
        this.exp = 0;
        this.item.put("usable item", 0);
        this.item.put("monster ball", 0);
        this.item.put("misc", 0);
    }
    public void learnSkill(String skill){
        skill = skill.toLowerCase();
        if(!this.skill.containsKey(skill)){
            this.skill.put(skill, 1);
        }
        else if(this.skill.containsKey(skill)){
            int u = this.skill.get(skill);
            u += 1;
            this.skill.put(skill, u);
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public float getDamage() {
        return damage;
    }

    public float getDefense() {
        return defense;
    }

    public float getMoney() {
        return money;
    }

    public int getLevel() {
        return level;
    }

    public void recieveItems(String item, int quantity){
        item = item.toLowerCase();
        if(this.item.get(item) != 0){
            int u = this.item.get(item);
            u += quantity;
            this.item.put(item, u);
        }
        else if(this.item.get(item) == 0){
            this.item.put(item, quantity);
        }
    }

    public void buy(String itemToBuy, int quantity) throws Exception {
        this.money -= quantity * 10;
        if(this.money >= 0){
            itemToBuy = itemToBuy.toLowerCase();
            recieveItems(itemToBuy, quantity);
        }
        else if (this.money < 0){
            throw new Exception("Your money are not enough.");
        }
    }

    public void sell(String itemToSell, int quantity) throws Exception {
        itemToSell = itemToSell.toLowerCase();
        if(itemToSell == "misc"){
            int u = this.item.get("misc");
            u -= quantity;
            if(u < 0){
                throw new Exception("Item is not enough to sell.");
            }
            else
                this.item.put("misc", u);
        }
        else if(itemToSell != "misc"){
            throw new Exception("Your items is not sell because they're not Misc item.");
        }
    }

    public void useItem(String usableItem) throws Exception {
        usableItem = usableItem.toLowerCase();
        if(usableItem == "usable item"){
            this.hp += 1;
            this.defense += 1;
            this.damage += 1;

            int d = this.item.get(usableItem);
            d -= 1;
            this.item.put(usableItem, d);
        }
        else if(usableItem == "monster ball"){
            int d = this.item.get(usableItem);
            d -= 1;
            this.item.put(usableItem, d);
        }
        else if(usableItem == "misc"){
            sell(usableItem, 1);
        }
        else{
            throw new Exception("Your don't have this item.");
        }
    }


    public String getItem() {
        String q = "";
        for (String s : this.item.keySet()) {
            q += s + " : " + this.item.get(s) + ", ";
//            System.out.println(s + " : " + this.item.get(s));
        }
        return q;
    }
}
