package GameCharacter;

public class Main {
    public static void main(String[] args) {
        // init character
        GameCharacter g = new GameCharacter("kitpavin");
        System.out.println("<<<<<<<<<<<<<<<<<< buy item >>>>>>>>>>>>>>>>>");
        try {
            g.buy("Usable item",1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(g.getItem());

        System.out.println("<<<<<<<<<<<<<<<<<< buy item >>>>>>>>>>>>>>>>>");
        try {
            g.buy("Usable item",10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(g.getItem());

        System.out.println("<<<<<<<<<<<<<<<<<< buy item >>>>>>>>>>>>>>>>>");
        try {
            g.buy("misc", 12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(g.getItem());

        System.out.println("<<<<<<<<<<<<<<<<<< buy item >>>>>>>>>>>>>>>>>");
        try {
            g.buy("Usable item", 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(g.getItem());

        System.out.println("<<<<<<<<<<<<<<<<<< sell item >>>>>>>>>>>>>>>>>");
        try {
            g.sell("usable item", 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("<<<<<<<<<<<<<<<<<< sell item >>>>>>>>>>>>>>>>>");
        try {
            g.sell("misc", 15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(g.getItem());

        System.out.println("<<<<<<<<<<<<<<<<<< use item >>>>>>>>>>>>>>>>>");
        try {
            g.useItem("usable item");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(g.getItem());
    }
}
